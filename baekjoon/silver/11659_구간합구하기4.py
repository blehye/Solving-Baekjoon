from sys import stdin

input = stdin.readline

n, m = map(int, input().split())

num_list = list(map(int, input().split()))

sum_list = [0]

sum = 0
for item in num_list:
    sum += item
    sum_list.append(sum)

for i in range(m):
    a, b = map(int, input().split())
    print(sum_list[b] - sum_list[a - 1])
