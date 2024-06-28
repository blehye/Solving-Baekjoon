from sys import stdin
from collections import deque

input = stdin.readline

cnt = int(input())

for _ in range(cnt):
    # n : 문서의 개수 , m: 몇번째로 인쇄되었는지 궁금한 문서 idx
    n, m = map(int, input().split())

    arr = list(map(int, input().split()))

    importance_arr = sorted(arr, reverse=True)

    que = deque()

    i = 0
    for item in arr:
        if i == m:
            que.append((item, "target"))
        else:
            que.append((item, "no"))
        i += 1

    idx = 0
    while que:
        pop = que.popleft()
        if importance_arr[idx] != pop[0]:
            que.append(pop)
        else:
            if pop[1] == "target":
                break
            idx += 1

    print(idx + 1)
