from sys import stdin
from collections import deque

input = stdin.readline

# 원본 문자열
s = input().strip()

que = deque()

for x in s:
    if x == "<":
        while que:
            pop = que.pop()
            print(pop, end="")
        que.append(x)
    elif x == ">":
        que.append(x)
        while que:
            pop = que.popleft()
            print(pop, end="")
    elif x == " ":
        if "<" not in que:
            while que:
                pop = que.pop()
                print(pop, end="")
            print(" ", end="")
        else:
            que.append(x)
    else:
        que.append(x)

while que:
    pop = que.pop()
    print(pop, end="")

# while len(s) > 0:
#     idx01 = s.find("<")
#     if idx01 > 0 or idx01 == -1:
#         str = s[0:idx01]
#         word_arr = str.split(" ")
#         idx = 1
#         for word in word_arr:
#             new_word = word[::-1]
#             print(new_word, end="")
#             if idx < len(word_arr):
#                 print(" ", end="")
#             idx += 1
#         s = s[idx01:]
#     else:
#         idx02 = s.find(">")
#         print(s[idx01 : idx02 + 1], end="")
#         s = s[idx02 + 1 :]
