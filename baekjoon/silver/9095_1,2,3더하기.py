from sys import stdin

input = stdin.readline

n = int(input())

list = [0] * 10

list[0] = 1
list[1] = 2
list[2] = 4


for _ in range(n):
    num = int(input())
    if num == 1 or num == 2 or num == 3:
        print(list[num - 1])
        continue
    for i in range(4, num + 1):
        list[i - 1] = list[i - 2] + list[i - 3] + list[i - 4]
    print(list[num - 1])
