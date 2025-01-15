a, b, c = map(int, input().split())

if a + b <= c or a + c <= b or b + c <= a:
    print("KHONGPHAITAMGIAC")
elif a == c and b == c:
    print("DEU")
elif a == b or b == c or c == a:
    if a ** 2 + b ** 2 == c ** 2 or b ** 2 + c ** 2 == a ** 2 or a ** 2 + c ** 2 == b ** 2:
        print("VUONG CAN")
    else:
        print("CAN")
elif a ** 2 + b ** 2 == c ** 2 or b ** 2 + c ** 2 == a ** 2 or a ** 2 + c ** 2 == b ** 2:
    print("VUONG")
else:
    print("THUONG")
