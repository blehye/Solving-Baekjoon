from sys import stdin

input = stdin.readline

dict = {"A+": 4.5, "A0": 4.0, "B+": 3.5, "B0": 3.0, "C+": 2.5, "C0": 2.0, "D+": 1.5, "D0": 1.0, "F": 0}

bunmo = 0
bunja = 0

for i in range(20):
    a, b, c = input().split()
    b = float(b)
    if c in dict:
        bunja += dict[c] * b
        bunmo += b

result = bunja / bunmo
print(f'{result:.6f}')
    

