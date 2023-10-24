from sys import stdin

input = stdin.readline
a = int(input())
b = int(input())


def prime_list(a, b):
    if b == 1:
        return None
    if b == 2:
        return [2]
    sieve = [True] * (b + 1)

    m = int(b**0.5)
    for i in range(2, m + 1):
        if sieve[i] == True:
            for j in range(i + i, b + 1, i):
                sieve[j] = False
    if a == 1:
        a = 2
    li = [i for i in range(a, b + 1) if sieve[i] == True]
    return li


list = prime_list(a, b)
if list:
    print(sum(list))
    print(min(list))
else:
    print(-1)
