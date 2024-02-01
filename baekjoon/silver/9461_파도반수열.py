from sys import stdin

input = stdin.readline

n = int(input())

list = [0 for _ in range(1000000)]

list[1] = 1
list[2] = 1
list[3] = 1

for i in range(n):
    num = int(input())
    if num <= 3:
        print(list[num])
        continue
    for j in range(4, num + 1):
        list[j] = list[j - 3] + list[j - 2]
    print(list[num])
