n = int(input())
for asdf in range(n):
    row = list(map(int, input().split()))
    sum = 0
    for i in row:
        if i % 2 == 0:
            sum += i
    print(sum) 
