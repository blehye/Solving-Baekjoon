from sys import stdin
from itertools import combinations

input = stdin.readline

n, m = map(int, input().split())
numList = list(map(int, input().split()))

com = list(combinations(numList, 3))

result = []

for i in range(len(com)):
    if sum(com[i]) <= m:
        result.append(sum(com[i]))

result.sort(reverse=True)
print(result[0])
