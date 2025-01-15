n = int(input())
a = list(map(int, input().split()))
d = dict({})
b = sorted(a, reverse = True)

sum = 0;
for i in b:
    if i not in d:
        d[i] = sum
    sum += i
for i in a:
    print(d[i], end = " ")
