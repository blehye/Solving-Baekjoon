from sys import stdin

input = stdin.readline

n = int(input())
result = []
for i in range(n):
    arr = list(map(int, input().split()))
    result.append(arr)

result.sort()

for i in range(len(result)):
    print(result[i][0], result[i][1])
