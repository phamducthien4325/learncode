n = int(input())
for i in range(n):
    row = list(map(int, input().split()))
    print(max(row))
