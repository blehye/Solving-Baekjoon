from sys import stdin
from collections import deque

input = stdin.readline

n, k = map(int, input().split())

que = deque()

arr = []

for i in range(1, n + 1):
    que.append(i)

while que:
    for _ in range(k - 1):
        x = que.popleft()
        que.append(x)
    p = que.popleft()
    arr.append(p)

print("<", end="")
idx = 1
for item in arr:
    if idx != len(arr):
        print(item, end=", ")
    else:
        print(item, end="")
    idx += 1
print(">", end="")
