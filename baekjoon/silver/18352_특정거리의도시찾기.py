from collections import deque
from sys import stdin

input = stdin.readline

n, m, k, x = map(int, input().split())

graph = [[] for _ in range(n + 1)]
visited = [(False, 0)] * (n + 1)

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)

result = []


# 최단거리 도시 찾기
def bfs(start):
    deq = deque([(start, 0)])
    visited[start] = (True, 0)

    while deq:
        pop, d = deq.popleft()
        neighborList = graph[pop]
        for item in neighborList:
            if visited[item][0] == False:
                if d + 1 == k:
                    result.append(item)
                visited[item] = (True, d + 1)
                deq.append((item, d + 1))


bfs(x)

result.sort()
if len(result) > 0:
    for item in result:
        print(item)
else:
    print(-1)
