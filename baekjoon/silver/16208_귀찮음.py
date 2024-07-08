from sys import stdin

input = stdin.readline

n = int(input())

num_list = list(map(int, input().split(" ")))

num_list.sort(reverse=True)

s = sum(num_list)
result = 0

for i in range(0, len(num_list) - 1):
    s -= num_list[i]
    result += num_list[i] * (s)

print(result)
