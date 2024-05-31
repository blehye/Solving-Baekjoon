from sys import stdin

input = stdin.readline

n = int(input())

arr = []

for _ in range(n):
    num = int(input())
    arr.append(num)
arr.sort()

for item in arr:
    print(item)
