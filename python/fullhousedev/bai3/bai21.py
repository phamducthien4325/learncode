n, m = map(int, input().split())
cnt = 0
for i in range(n):
    row = list(map(int, input().split()))
    for k in row:
        if k % 3 == 0:
            cnt += 1 
print(cnt)
