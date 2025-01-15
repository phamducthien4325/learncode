n = int(input())
l = list(map(int, input().split()))
max = -1e12
sum = 0
for i in l:
    sum += i
    if sum > max:
        max = sum
    if sum < 0:
        sum = 0
print(max)
