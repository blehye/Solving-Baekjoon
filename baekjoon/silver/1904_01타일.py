from sys import stdin

input = stdin.readline

n = int(input())

# 1 -> 1
# 2 -> 00, 11
# 3 -> 001, 100, 111
# 4 -> 0000, 0011, 1001, 1100, 1111
# 5 -> 00001, 00100, 00111, 10000, 10011, 11001, 11100, 11111

list = [0] * 1000001
list[1] = 1
list[2] = 2

for i in range(n + 1):
    if i <= 2:
        continue
    list[i] = list[i - 2] + list[i - 1]
    list[i] %= 15746

print(list[n])
