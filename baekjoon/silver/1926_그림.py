from collections import deque
from sys import stdin

input = stdin.readline
# 세로 n, 가로 m
n, m = map(int, input().split())

# 그림 정보
graph = [list(map(int, input().split())) for _ in range(n)]

# 방문 정보
visit = [[False] * m for _ in range(n)]

# 상하좌우
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

result = []


def bfs(y, x):
    if visit[y][x] == True:
        return
    deq = deque([((y, x), 1)])
    visit[y][x] = True
    cnt = 1
    while deq:
        pop = deq.popleft()
        y = pop[0][0]
        x = pop[0][1]
        global d
        d = pop[1]

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if ny < n and ny >= 0 and nx >= 0 and nx < m:
                if visit[ny][nx] == False and graph[ny][nx] == 1:
                    visit[ny][nx] = True
                    cnt += 1
                    deq.append(((ny, nx), cnt))
    result.append(d)


for i in range(n):
    for j in range(m):
        if graph[i][j] == 1:
            bfs(i, j)
print(len(result))
if len(result) > 0:
    print(max(result))
else:
    print(0)
