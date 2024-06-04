from sys import stdin
from itertools import combinations

input = stdin.readline

n, s = map(int, input().split())

arr = list(map(int, input().split()))

result_cnt = 0

for i in range(1, len(arr) + 1):
    com = combinations(arr, i)

    for item in com:
        if sum(item) == s:
            result_cnt += 1

print(result_cnt)
