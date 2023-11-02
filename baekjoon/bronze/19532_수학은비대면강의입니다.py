from sys import stdin

input = stdin.readline

a, b, c, d, e, f = map(int, input().split())

if a == 0:
    y = c // b
    x = (f - (e * y)) // d
elif b == 0:
    x = c // a
    y = (f - d * x) // e
elif d == 0:
    y = f // e
    x = (c - b * y) // a
elif e == 0:
    x = f // d
    y = (c - a * x) // b
else:
    y = ((c * d) - (f * a)) // ((b * d) - (e * a))
    x = (c - b * y) // a
print(x, y)
