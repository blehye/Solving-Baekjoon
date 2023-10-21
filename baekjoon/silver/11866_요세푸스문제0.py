from sys import stdin
from collections import deque
input = stdin.readline

n, m = map(int, input().split())

deque = deque([i+1 for i in range(n)])
list = []
cnt = 1

while True:
    if not deque:
        break
    pop = deque.popleft()
    if (cnt != m):
        deque.append(pop)
        cnt += 1
    else:
        list.append(pop)
        cnt = 1
        
print("<", end="")
idx = 0
for i in list:
    print(i, end="")
    idx+=1
    if (idx != len(list)):
        print(",", end=" ")
print(">")