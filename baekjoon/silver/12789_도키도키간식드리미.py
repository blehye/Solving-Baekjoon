from sys import stdin
from collections import deque

que = deque()
que2 = deque()

input = stdin.readline

n = int(input())
list = list(map(int, input().split()))

for i in list:
    que.append(i)

num = 1


def check():
    global num
    result = False
    if que2:
        x = que2.popleft()
        if x != num:
            que2.appendleft(x)
        else:
            result = True
            num += 1
    return result


while True:
    if not que:
        break
    x = que.popleft()
    c = check()
    if x > num and not c:
        que2.appendleft(x)
    elif x > num and c:
        que.appendleft(x)
    else:
        num += 1

while True:
    if not que2:
        break
    x = que2.popleft()
    if x > num:
        print("Sad")
        break
    else:
        num += 1

if not que2:
    print("Nice")
