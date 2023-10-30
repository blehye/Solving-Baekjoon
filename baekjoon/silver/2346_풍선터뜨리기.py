from sys import stdin
from collections import deque

input = stdin.readline

n = int(input())
list = list(map(int, input().split()))

deque = deque()

for i in range(n):
    x = dict()
    x[i + 1] = list[i]
    deque.append(x)

isPlus = True

while True:
    if isPlus:
        p = deque.popleft()
    else:
        p = deque.pop()
    for q in p.keys():
        q2 = q

    if p[q2] >= 0:
        isPlus = True
    else:
        isPlus = False
    print(q2, end=" ")

    if not deque:
        break

    if p[q2] >= 0:
        for i in range(p[q2] - 1):
            p2 = deque.popleft()
            deque.append(p2)
    else:
        for i in range(p[q2] * (-1) - 1):
            p2 = deque.pop()
            deque.appendleft(p2)
