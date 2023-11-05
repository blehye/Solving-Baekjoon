from sys import stdin
import math

input = stdin.readline

a, b = map(int, input().split())
c, d = map(int, input().split())

y = b * d
x = a * d + b * c

z = math.gcd(x, y)

x = x // z
y = y // z

print(x, y)
