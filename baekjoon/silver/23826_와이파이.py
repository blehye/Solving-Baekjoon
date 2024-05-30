from sys import stdin

input = stdin.readline

n = int(input())

x, y, e = map(int, input().split())

hot_list = []

result = []

for _ in range(n):
    li = list(map(int, input().split()))
    hot_list.append(li)

for item in hot_list:
    # 공용 와이파이 세기 계산
    xx = item[0]
    yy = item[1]
    ee = item[2]
    public_e = e - (abs(x - xx) + abs(y - yy))
    if public_e < 0:
        public_e = 0

    hot_e = 0
    # 핫스팟 와이파이 세기 계산
    for item_hot in hot_list:
        xxx = item_hot[0]
        yyy = item_hot[1]
        eee = item_hot[2]
        h_e = eee - (abs(xx - xxx) + abs(yy - yyy))
        if h_e < 0:
            h_e = 0
        hot_e += h_e
    re_e = public_e - hot_e
    if re_e < 0:
        re_e = 0
    result.append(re_e)

ans = max(result)
if ans == 0:
    print("IMPOSSIBLE")
else:
    print(ans)
