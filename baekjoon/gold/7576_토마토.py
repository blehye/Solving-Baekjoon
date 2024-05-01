from collections import deque

# m 가로, n 세로
m, n = map(int, input().split())

# 그래프 0: 안익은토마토 1: 익은토마토 -1:없음
graph = [list(map(int, input().split())) for _ in range(n)]

# 방문여부
visited = [[False] * m for _ in range(n)]
ripe_tomatoes = deque()

# 익은 토마토의 좌표를 큐에 추가하고 방문 표시
for i in range(n):
    for j in range(m):
        if graph[i][j] == 1:
            ripe_tomatoes.append((i, j))
            visited[i][j] = True

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

while ripe_tomatoes:
    y, x = ripe_tomatoes.popleft()

    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if 0 <= ny < n and 0 <= nx < m:
            if graph[ny][nx] == 0 and not visited[ny][nx]:
                graph[ny][nx] = graph[y][x] + 1
                visited[ny][nx] = True
                ripe_tomatoes.append((ny, nx))

days = 0
for row in graph:
    for tomato in row:
        if tomato == 0:
            print(-1)
            exit()
        days = max(days, tomato)

print(days - 1)
