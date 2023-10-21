from sys import stdin
input = stdin.readline

n, m = map(int, input().split())

dict1 = {}
list2 = []
for i in range(n):
    str = input().strip()
    dict1[str] = 1
    
for i in range(m):
    str = input().strip()
    list2.append(str)
    
cnt = 0
for i in range(m):
    if list2[i] in dict1:
        cnt += 1
            
print(cnt)