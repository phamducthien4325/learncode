n, l, r = map(int, input().split())
a = list(map(int, input().split()))
for i in a:
    x = i
    if l <= i and i <= r:
        x = i
    elif i < l:
        x = l
    else:
        x = r
    print(x, end = " ")
