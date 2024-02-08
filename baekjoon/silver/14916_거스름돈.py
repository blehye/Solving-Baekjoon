from sys import stdin

input = stdin.readline

n = int(input())

x = n % 5

if x == 0:
    print(n // 5)

if n == 1 or n == 3:
    print(-1)
if n == 2:
    print(1)
if n == 4:
    print(2)

if x != 0:
    save = n // 5
    t = n % 5
    while save > 0:
        if t % 2 == 0:
            save += t // 2
            print(save)
            break
        if t % 2 != 0:
            save -= 1
            n = n - (5 * save)
            if n % 2 == 0:
                print(save + n // 2)
                break
