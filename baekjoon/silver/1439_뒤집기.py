from sys import stdin

input = stdin.readline

str = input().strip()

idx = 1
cnt = 0
for i in range(len(str) - 1):
    if str[idx - 1] != str[idx]:
        cnt += 1
    idx += 1
print((cnt + 1) // 2)
