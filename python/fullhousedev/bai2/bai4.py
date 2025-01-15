import math
a, b, r = map(int, input().split())

res = a * b
res = res - math.pi * r * r

print(f"{res:.2f}")
