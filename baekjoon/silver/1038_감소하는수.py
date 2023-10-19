import sys
from sys import stdin
from collections import deque

input = stdin.readline

# n번째 감소하는 수
n = int(input())

# 처리횟수
cnt = 10

deque = deque([1,2,3,4,5,6,7,8,9])
flag = False

def solution(n):
    global cnt
    global flag
    if n > 1022:
        print(-1)
        return
    if 0 <= n <= 9:
        print(n)
        return
    while(not flag):
        pop = deque.popleft()
        target = pop % 10
        if target == 0:
            continue
        for i in range(pop % 10):
            new = str(pop) + str(i)
            deque.append(int(new))
            if (n == cnt):
                print(deque.pop())
                flag = True
                break
            else:
                cnt += 1
    
solution(n)




# arr = [None for _ in range(2)]
# visited = [False for _ in range(n)]
# result = ""

# def dfs(m, depth):
#     global n, arr, visited, result
#     if (m == depth):
#         x = ""
#         for i in arr:
#             x += str(i)
#         result = x
#         return
#     for i in range(n):
#         if not visited[i]:
#             visited[i] = True
#             arr[depth] = i
#             dfs(m, depth + 1)
#             visited[i] = False
# dfs(2, 0)
# print(result)

# # 처리횟수
# cnt = 0

# result = 0

# def dfs(num):
#     global n
#     global cnt
#     global result
#     if (checkDescNum(num)):  
#         cnt += 1
        
#     if cnt == n:
#         result = num
#         return 
#     if num == 9876543210:
#         result = -1
#         return
    
#     if checkLastNum(num):
#         dfs(nextNum(len(str(num))))
#     else:
#         dfs(num+1)

# def checkDescNum(num):
#     numList = list(map(int, str(num)))
#     if len(numList) == 1:
#         return True
#     for i in range(len(numList) - 1):
#         if (numList[i] <= numList[i+1]):
#             return False
#     return True

# def checkLastNum(num):
#     numList = list(map(int, str(num)))
#     flag = True
    
#     for i in range(len(numList) - 1):
#         if (numList[i] - numList[i + 1] != 1):
#             flag = False
        
#     if (flag and numList[0] != 9):
#         nextNum(num)
#         return False
#     return True

# def nextNum(length):
#     x = ""
#     for i in range(length, 0, -1):
#         x += str(i)
#     x += "0"
#     return int(x)
# dfs(0)
# print(result)


