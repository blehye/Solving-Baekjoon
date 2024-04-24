from collections import deque
from sys import stdin

input = stdin.readline
n, m = map(int, input().split())  # 가로, 세로

graph = [list(map(int, input().split())) for _ in range(m)]

dx = [1, 0]
dy = [0, 1]


def bfs():
    visit = [[False] * (n + 1) for _ in range(m + 1)]

    deq = deque([(1, 1)])
    visit[1][1] = True
    while deq:
        x, y = deq.popleft()
        if x == n and y == m:
            return "Yes"

        for i in range(2):
            nx = x + dx[i]
            ny = y + dy[i]
            if (
                nx <= n
                and ny <= m
                and graph[ny - 1][nx - 1] == 1
                and visit[ny][nx] == False
            ):
                visit[ny][nx] = True
                deq.append((nx, ny))
    return "No"


print(bfs())
