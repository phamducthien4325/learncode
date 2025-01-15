n, m = map(int, input().split())
l = []
min_row = []
for i in range(n):
    row = list(map(int, input().split()))
    min_row.append(min(row))
    l.append(row)
max_col = []
for i in range(m):
    Max = -1e15
    for j in range(n):
        if l[j][i]  > Max:
            Max = l[j][i]
    max_col.append(Max)
cnt = 0
for i in range(n):
    for j in range(m):
        if l[i][j] == min_row[i] and l[i][j] == max_col[j]:
            print(f"{i + 1} {j + 1}")
            cnt += 1
if cnt == 0:
    print(-1)
