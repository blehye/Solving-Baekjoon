from sys import stdin

input = stdin.readline
n = int(input())

nLen = len(str(n))

x = 1
while True:
    if x == n:
        print(0)
        break
    xStr = str(x)
    xLen = len(xStr)
    sum = 0
    for i in range(xLen):
        sum += int(xStr[i])
    sum += x
    if n == sum:
        print(x)
        break
    x += 1
