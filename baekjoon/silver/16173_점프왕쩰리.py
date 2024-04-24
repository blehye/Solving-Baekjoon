from collections import deque
from sys import stdin

input = stdin.readline

n = int(input())

graph = [list(map(int, input().split())) for _ in range(n)]
visit = [[False] * (n + 1) for _ in range(n + 1)]


def bfs():
    deq = deque([(1, 1)])
    visit[1][1] = True

    while deq:
        x, y = deq.popleft()

        d = graph[y - 1][x - 1]

        dx = [d, 0]
        dy = [0, d]

        if x == n and y == n:
            return "HaruHaru"

        for i in range(2):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx <= n and ny <= n and visit[ny][nx] == False:
                visit[ny][nx] = True
                deq.append((nx, ny))
    return "Hing"


print(bfs())
