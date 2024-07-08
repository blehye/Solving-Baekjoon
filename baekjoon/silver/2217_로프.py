from sys import stdin

input = stdin.readline

n = int(input())
num_list = []
result_list = []

for _ in range(n):
    x = int(input())
    num_list.append(x)
    result_list.append(x)

num_list.sort(reverse=True)

for i in range(1, len(num_list)):
    x = num_list[i] * (i + 1)
    result_list.append(x)

print(max(result_list))
