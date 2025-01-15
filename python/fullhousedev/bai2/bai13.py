x1, v1, x2, v2 = map(int, input().split())

res = abs(x2 - x1) % abs(v2 -v1)
if res == 0:
    print("YES")
else:
    print("NO")
