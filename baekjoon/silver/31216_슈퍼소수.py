from sys import stdin
import math
import copy

# 테스트 케이스 개수 T
T = int(input())

MAX = 318137
prime = [True for i in range(MAX + 1)]
prime[0] = False
prime[1] = False

for i in range(2, int(math.sqrt(MAX)) + 1):
    if prime[i] == True:
        j = 2
        while i * j <= MAX:
            prime[i * j] = False
            j += 1

# prime_copy = copy.deepcopy(prime)

prime_index = 0
super = [0]
for i in range(2, MAX + 1):
    if prime[i] == True:
        prime_index += 1
        if prime[prime_index] == True:
            super.append(i)

# for i in range(len(prime)):
#     if prime[i] == True:
#         super.append(i)

for _ in range(T):
    n = int(input())
    print(super[n])

# for _ in range(T):
#     n = int(input())

#     prime_index = 0  # 몇번째로 작은 소수인지
#     super_index = 0  # 몇번째로 작은 슈퍼소수인지
#     index = 0
#     for item in prime:
#         if item:
#             prime_index += 1
#             if prime[prime_index]:
#                 super_index += 1
#         if super_index == n:
#             print(index)
#             break
#         index += 1
