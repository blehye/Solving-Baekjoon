from sys import stdin
input = stdin.readline

n = int(input())

set = set()

for i in range(n):
    str = input().strip()
    set.add(str)
    
list = list(set)

list.sort()
list.sort(key=lambda x: len(x))

for i in range(len(list)):
    print(list[i])