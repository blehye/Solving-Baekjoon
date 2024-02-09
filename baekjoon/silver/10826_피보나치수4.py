from sys import stdin

input = stdin.readline

n = int(input())

list = [0] * 10001
list[1] = 1

for i in range(2, n + 1):
    if n == 0 or n == 1:
        break
    list[i] = list[i - 1] + list[i - 2]
print(list[n])
