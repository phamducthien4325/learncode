n = int(input())

for i in range(2, n + 2):
    for j in range(i, i + n):
        print(j, end = " ")
    print("")
