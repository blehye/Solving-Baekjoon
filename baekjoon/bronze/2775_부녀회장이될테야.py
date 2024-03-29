from sys import stdin

input = stdin.readline

num = int(input())

for _ in range(num):
    k = int(input())
    n = int(input())
    people = [i for i in range(1, n + 1)]
    for _ in range(k):
        for i in range(1, n):
            people[i] += people[i - 1]
    print(people[n - 1])
