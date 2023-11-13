from sys import stdin
from collections import deque

input = stdin.readline
que = deque()

n = int(input())

for _ in range(n):
    arr = input().rsplit()

    if arr[0] == "push":
        que.append(int(arr[1]))
    elif arr[0] == "pop":
        if que:
            x = que.popleft()
            print(x)
        else:
            print(-1)
    elif arr[0] == "size":
        if que:
            print(len(que))
        else:
            print(0)
    elif arr[0] == "empty":
        if que:
            print(0)
        else:
            print(1)
    elif arr[0] == "front":
        if que:
            print(que[0])
        else:
            print(-1)
    elif arr[0] == "back":
        if que:
            print(que[len(que) - 1])
        else:
            print(-1)
