from sys import stdin

input = stdin.readline

aList = []
bList = []

n = int(input())
for i in range(n):
    a, b = map(int, input().split(" "))
    aList.append(a)
    bList.append(b)

sorted(aList)
sorted(bList)

print((max(aList) - min(aList)) * (max(bList) - min(bList)))
