from sys import stdin
input = stdin.readline

str = input().strip()

n = len(str)

result = set()

for i in range(n):
    for j in range(0, n-i):
        x = str[j:j+i+1]
        result.add(x)
        
print(len(result))