from sys import stdin

input = stdin.readline

while True:
    n = int(input())
    if n == -1:
        break
    arr = []
    for i in range(1, n):
        if n % i == 0:
            arr.append(i)

    if sum(arr) == n:
        print(str(n) + " = ", end="")
        x = 0
        for i in range(len(arr)):
            print(arr[i], end="")
            if x != len(arr) - 1:
                print(" + ", end="")
            x += 1
        print("\n", end="")
    else:
        print(str(n) + " is NOT perfect.")
