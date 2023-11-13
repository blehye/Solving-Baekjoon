import time
from requests import get
from notion_client import Client

notion = Client(auth="secret_f1CHbd6gJ5NAcR2BexS55T2stzCXfO3g3xE5VMbzRO0")
database_id = "8da0a60aa0e1450da6b2c5aba02e99af"


my_page = notion.databases.query(
    **{
        "database_id": database_id,
        "filter": {
            "and": [
                {
                    "property": "사람",
                    "people": {"contains": "76dcf1f4-4ce7-49d6-9746-b21341b1ef19"},
                },
                {"property": "알고리즘 분류", "multi_select": {"is_empty": True}},
            ]
        },
    }
)

cores = ["브론즈", "실버", "골드", "플레티넘", "다이아몬드", "루비"]
levels = [1, 5, 4, 3, 2]
for page in my_page["results"]:
    time.sleep(0.2)
    problem_num = page["properties"]["문제 링크"]["url"].split("/")[-1]
    json_data = get(
        f"https://solved.ac/api/v3/problem/show?problemId={problem_num}",
        headers={"Accept": "application/json"},
    ).json()

    algos = []
    for tag in json_data.get("tags"):
        for tag_info in tag.get("displayNames"):
            if tag_info.get("language") == "ko":
                algos.append({"name": tag_info.get("name")})

    N = json_data.get("level")
    core = cores[(N - 1) // 5]
    level = levels[N % 5]
    title = f"{problem_num}_{json_data['titleKo']}"
    update_data = {
        "단계": {"select": {"name": f"{core} {level}"}},
        "알고리즘 분류": {"multi_select": algos},
        "문제명": {
            "title": [
                {
                    "text": {"content": title, "link": None},
                    "plain_text": title,
                }
            ]
        },
    }
    notion.pages.update(page_id=page["id"], properties=update_data)
    print(title)
