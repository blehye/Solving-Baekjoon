from sys import stdin

input = stdin.readline

n = int(input())

# 1. 5로 나눴을때 최대로 나눌 수 있는 수 구하기 m
# 2. m 부터 0 까지 순회 하면서 나머지가 3으로 나누어 떨어질 때 리턴
# 3. 0까지 돌아도 나머지가 3으로 나누어 떨어지지 않으면 -1 리턴

m = n // 5
flag = False

while m != -1:
    x = n - (m * 5)
    if x % 3 == 0:
        print(m + (x // 3))
        flag = True
        break
    m -= 1

if not flag:
    print(-1)
