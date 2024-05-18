from sys import stdin
from collections import deque

input = stdin.readline

# n : 노드의 개수 m : 거리를 알고싶은 노드 쌍의 개수
n, m = map(int, input().split())

graph = [[] for _ in range(n + 1)]


for _ in range(n - 1):
    a, b, distance = map(int, input().split())
    graph[a].append((b, distance))
    graph[b].append((a, distance))


def bfs(start, end):
    deq = deque([(start, 0)])
    visited[start] = True

    while deq:
        pop = deq.popleft()
        target = pop[0]
        distance = pop[1]

        if target == end:
            return distance

        for item in graph[target]:
            if visited[item[0]] == False:
                visited[item[0]] = True
                deq.append((item[0], item[1] + distance))


for _ in range(m):
    visited = [False] * (n + 1)
    start, end = map(int, input().split())
    result = bfs(start, end)
    print(result)
