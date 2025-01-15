from math import sqrt
n = int(input())

def nto(n: int):
    for i in range(2, int(sqrt(n)) + 1):
        if n % i == 0:
            return False 
    return n > 1

if nto(n):
    print("Yes")
else:
    print("No")
