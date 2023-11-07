from sys import stdin
from collections import deque

input = stdin.readline

stack = deque()

n = int(input())

while n > 0:
    arr = list(map(int, input().split()))

    if arr[0] == 1:
        # 정수를 스택에 넣는다
        stack.append(arr[1])
    elif arr[0] == 2:
        # 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
        if stack:
            print(stack.pop())
        else:
            print(-1)
    elif arr[0] == 3:
        # 스택에 들어있는 정수의 개수를 출력한다.
        print(len(stack))
    elif arr[0] == 4:
        # 스택이 비어있으면 1, 아니면 0을 출력한다.
        if stack:
            print(0)
        else:
            print(1)
    else:
        # 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
        if stack:
            x = stack.pop()
            print(x)
            stack.append(x)
        else:
            print(-1)

    n -= 1
