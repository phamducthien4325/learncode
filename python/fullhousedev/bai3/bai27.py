n, m = map(int, input().split())
d = dict({})
for i in range(n):
    row = list(map(int, input().split()))
    for j in row:
        if j in d:
            d[j] += 1
        else:
            d[j] = 1
cnt = 0
d = dict(sorted(d.items()))
for i in d.keys():
    for j in range(d[i]):
        print(i, end = " ")
        cnt += 1
        if cnt == m:
            cnt = 0
            print("")
