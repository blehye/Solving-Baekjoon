from sys import stdin

input = stdin.readline

while True:
    a, b, c = map(int, input().split(" "))

    if a == b and b == 0 and c == 0:
        break

    list = [a, b, c]
    sorted(list)
    if list[2] >= list[0] + list[1]:
        print("Invalid")
        continue
    if a == b == c:
        print("Equilateral")
        continue
    if a == b or a == c or b == c:
        print("Isosceles")
        continue
    if a != b and a != c and b != c:
        print("Scalene")
        continue
