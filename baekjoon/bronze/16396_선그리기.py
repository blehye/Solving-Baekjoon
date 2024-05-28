from sys import stdin

input = stdin.readline

n = int(input())

line = [False] * 10001

for _ in range(n):
    a, b = map(int, input().split())
    for i in range(a, b):
        line[i] = True

result = line.count(True)
print(result)
