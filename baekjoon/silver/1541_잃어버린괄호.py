from sys import stdin

input = stdin.readline

arr = input().strip().split("-")

result = []

for item in arr:
    num_list = item.split("+")
    sum = 0
    for num in num_list:
        sum += int(num)
    result.append(sum)

answer = result[0]
for i in range(1, len(result)):
    answer -= result[i]

print(answer)
