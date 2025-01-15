n = int(input())
l = list(map(int, input().split()))
l = sorted(l, key = lambda x: -x)
for i in range(len(l)):
    if l[i] != l[0]:
        print(l[i])
        break
