from sys import stdin
from collections import deque

input = stdin.readline

deque = deque()

n = int(input())

for _ in range(n):
    arr = list(map(int, input().split()))

    if arr[0] == 1:
        deque.appendleft(arr[1])
    if arr[0] == 2:
        deque.append(arr[1])
    if arr[0] == 3:
        if deque:
            p = deque.popleft()
            print(p)
        else:
            print(-1)
    if arr[0] == 4:
        if deque:
            p = deque.pop()
            print(p)
        else:
            print(-1)
    if arr[0] == 5:
        if deque:
            print(len(deque))
        else:
            print(0)
    if arr[0] == 6:
        if deque:
            print(0)
        else:
            print(1)
    if arr[0] == 7:
        if deque:
            p = deque[0]
            print(p)
        else:
            print(-1)
    if arr[0] == 8:
        if deque:
            p = deque[len(deque) - 1]
            print(p)
        else:
            print(-1)
