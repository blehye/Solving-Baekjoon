from sys import stdin
import math

input = stdin.readline

n = int(input())

for _ in range(n):
    a, b = map(int, input().split())
    result = math.factorial(b) / (math.factorial(a) * math.factorial(b - a))
    print(int(result))
