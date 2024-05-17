from sys import stdin
from collections import deque


input = stdin.readline

# 세로, 가로
m, n = map(int, input().split())

graph = [list(input().strip().split(" ")) for _ in range(m)]

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]


def bfs():
    deq = deque([(0, 0)])
    visited[0][0] = True

    cheeze = deque()

    while deq:
        pop = deq.popleft()
        y = pop[0]
        x = pop[1]

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx >= 0 and nx < n and ny >= 0 and ny < m:
                if visited[ny][nx] == False and graph[ny][nx] == "0":
                    visited[ny][nx] = True
                    deq.append((ny, nx))
                elif visited[ny][nx] == False and graph[ny][nx] == "1":
                    visited[ny][nx] = True
                    cheeze.append((ny, nx))
    for item in cheeze:
        ch_y = item[0]
        ch_x = item[1]
        graph[ch_y][ch_x] = "0"
    return len(cheeze)


totalCnt = 0
for i in range(n):
    for j in range(m):
        if graph[j][i] == "1":
            totalCnt += 1

cycle = 0
while True:
    visited = [[False] * n for _ in range(m)]
    meltCnt = bfs()
    totalCnt -= meltCnt
    cycle += 1
    if totalCnt == 0:
        print(cycle)
        print(meltCnt)
        break
