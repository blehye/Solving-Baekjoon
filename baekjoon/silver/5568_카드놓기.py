from sys import stdin
from itertools import permutations

input = stdin.readline

# 카드 개수
n = int(input())

# 뽑는 카드 개수
k = int(input())

arr = []

for _ in range(n):
    x = int(input())
    arr.append(x)

result = set()
per = permutations(arr, k)
for item in per:
    m = map(str, item)
    numStr = "".join(m)
    num = int(numStr)
    result.add(num)

print(len(result))
