from sys import stdin

input = stdin.readline

a, b, c = map(int, input().split())
list = sorted([a, b, c])

if list[2] >= list[0] + list[1]:
    result = list[0] + list[1] + list[0] + list[1] - 1
else:
    result = list[0] + list[1] + list[2]
print(result)
