from sys import stdin
from collections import deque

input = stdin.readline

n = int(input())
li = list(map(int, input().split()))

left = 0
max_length = 0

min_deque = deque()
max_deque = deque()

for right in range(n):
    while min_deque and li[min_deque[-1]] > li[right]:
        min_deque.pop()
    min_deque.append(right)

    while max_deque and li[max_deque[-1]] < li[right]:
        max_deque.pop()
    max_deque.append(right)

    while li[max_deque[0]] - li[min_deque[0]] > 2:
        if min_deque[0] == left:
            min_deque.popleft()
        if max_deque[0] == left:
            max_deque.popleft()
        left += 1

    max_length = max(max_length, right - left + 1)

print(max_length)
