from sys import stdin

input = stdin.readline

n = int(input())

t = [list(map(int, input().split())) for _ in range(n)]

for i in range(n):
    for j in range(i + 1):
        if i == 0:
            continue
        if j == 0:
            t[i][j] += t[i - 1][j]
            continue
        if j == i:
            t[i][j] += t[i - 1][j - 1]
            continue
        a = t[i - 1][j]
        b = t[i - 1][j - 1]
        if a > b:
            t[i][j] += a
        else:
            t[i][j] += b

list = t[len(t) - 1]
print(max(list))
