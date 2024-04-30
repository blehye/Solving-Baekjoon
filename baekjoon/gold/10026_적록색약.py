from collections import deque
from sys import stdin

input = stdin.readline

n = int(input())

graph = [list(input().strip()) for _ in range(n)]

visited = [[False] * n for _ in range(n)]
visited2 = [[False] * n for _ in range(n)]

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

cnt = 0
cnt2 = 0


def bfs(y, x):
    global cnt
    visited[y][x] = True
    deq = deque([(y, x)])
    target = graph[y][x]

    while deq:
        pop = deq.popleft()
        y = pop[0]
        x = pop[1]

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx >= 0 and nx < n and ny >= 0 and ny < n:
                if visited[ny][nx] == False and graph[ny][nx] == target:
                    visited[ny][nx] = True
                    deq.append((ny, nx))
    cnt += 1


def bfs2(y, x):
    global cnt2
    visited2[y][x] = True
    deq = deque([(y, x)])
    target = graph[y][x]

    while deq:
        pop = deq.popleft()
        y = pop[0]
        x = pop[1]

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx >= 0 and nx < n and ny >= 0 and ny < n:
                if visited2[ny][nx] == False and checkColor(target, graph[ny][nx]):
                    visited2[ny][nx] = True
                    deq.append((ny, nx))
    cnt2 += 1


def checkColor(target, now):
    if target == "G" or target == "R":
        if now == "G" or now == "R":
            return True
        else:
            return False
    else:
        if target == now:
            return True
        else:
            return False


for i in range(n):
    for j in range(n):
        if visited[i][j] == False:
            bfs(i, j)

for i in range(n):
    for j in range(n):
        if visited2[i][j] == False:
            bfs2(i, j)

print(str(cnt) + " " + str(cnt2))
