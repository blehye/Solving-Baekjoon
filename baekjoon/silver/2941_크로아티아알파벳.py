from sys import stdin

input = stdin.readline

list = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

str = input().strip()

cnt = 0

for item in list:
    c = str.count(item)
    if c > 0:
        str = str.replace(item, " ")
        cnt += c
        
print(cnt + len(str.replace(" ","")))