from math import sqrt
a, b, c = map(int, input().split())

p = (a + b + c) / 2

res = sqrt(p * (p - a) * (p - b) * (p - c))
print(f"{res:.2f}")
