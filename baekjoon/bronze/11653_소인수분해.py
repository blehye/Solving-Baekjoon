from sys import stdin

input = stdin.readline

n = int(input())
if n != 1:
    i = 2
    while i != n + 1 or n != 1:
        if n % i == 0:
            print(i)
            n = n // i
            i = 2
            continue
        i += 1
