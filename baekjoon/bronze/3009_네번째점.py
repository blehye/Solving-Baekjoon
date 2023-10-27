from sys import stdin

input = stdin.readline

left_dict = {}
right_dict = {}

for i in range(3):
    a, b = map(int, input().split(" "))
    if a in left_dict:
        left_dict[a] += 1
    else:
        left_dict[a] = 1
    if b in right_dict:
        right_dict[b] += 1
    else:
        right_dict[b] = 1

for key in left_dict.keys():
    if left_dict[key] == 1:
        print(key, end=" ")

for key in right_dict.keys():
    if right_dict[key] == 1:
        print(key, end="")
