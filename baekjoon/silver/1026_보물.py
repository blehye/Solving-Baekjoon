from sys import stdin

input = stdin.readline

n = int(input())

listA = list(map(int, input().split()))
listB = list(map(int, input().split()))

listA.sort()
listB.sort(reverse=True)

sum = 0
for i in range(n):
    sum += listA[i] * listB[i]
print(sum)
