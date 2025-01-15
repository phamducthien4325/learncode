import math

a, b, c = map(int, input().split())
delta = b * b - 4 * a * c
if a == 0:
    if b == 0 and c == 0:
        print("VO SO NGHIEM")
    elif b == 0:
        print("VO NGHIEM")
    else:
        x = -c / b
        print(f"{x:.2f}")
else:
    if delta < 0:
        print("VO NGHIEM")
    elif delta == 0:
        x = -b / (2 * a)
        print("PT CO NGHIEM KEP")
        print("X = " + f"{x:.2f}")
    else:
        x1 = (-b + math.sqrt(delta))/ (2 * a)
        x2 = (-b - math.sqrt(delta))/ (2 * a)
        print("PT CO HAI NGHIEM")
        print("X1 = " + f"{x1:.2f}")
        print("X2 = " + f"{x2:.2f}")
