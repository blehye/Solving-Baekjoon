from sys import stdin

input = stdin.readline

n = int(input())

s = set()

cnt = 0

for _ in range(n):
    str = input().strip()
    if str == "ENTER":
        cnt += len(s)
        s.clear()
        continue
    s.add(str)
cnt += len(s)
print(cnt)
