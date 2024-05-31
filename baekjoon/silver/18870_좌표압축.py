from sys import stdin

input = stdin.readline

n = int(input())

num_list = list(map(int, input().split()))

num_list_copy = []

for item in num_list:
    num_list_copy.append(item)

s = set(num_list)
num_list = list(s)
num_list.sort()

d = dict()
d = {num_list[i]: i for i in range(len(num_list))}

new_list = []

for item in num_list_copy:
    print(d[item], end=" ")
