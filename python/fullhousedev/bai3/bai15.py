t = int(input())

for test in range(t):
    n = int(input())
    l = list(map(int, input().split()))
    Max = max(l)
    res = l.count(Max)
    print(res)
