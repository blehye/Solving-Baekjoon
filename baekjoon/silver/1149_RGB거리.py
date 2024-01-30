from sys import stdin

input = stdin.readline

n = int(input())

li = [list(map(int, input().split())) for _ in range(n)]

for i in range(1, n):
    a = li[i][0]
    b = li[i][1]
    c = li[i][2]

    a2 = li[i - 1][0]
    b2 = li[i - 1][1]
    c2 = li[i - 1][2]

    if b2 < c2:
        li[i][0] += b2
    else:
        li[i][0] += c2
    if a2 < c2:
        li[i][1] += a2
    else:
        li[i][1] += c2
    if a2 < b2:
        li[i][2] += a2
    else:
        li[i][2] += b2

result = li[n - 1]
print(min(result))
