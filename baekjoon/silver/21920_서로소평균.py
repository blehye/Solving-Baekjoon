from sys import stdin
import math

input = stdin.readline

n = int(input())
num_list = list(map(int, input().split()))
x = int(input())
result = []

for item in num_list:
    if math.gcd(x, item) == 1:
        result.append(item)
print(sum(result) / len(result))
print(111)
