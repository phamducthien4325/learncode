s = input()
def calculate(s:str) -> int:
    res = 0
    current = ""
    operation = True
    for c in s:
        if "0" <= c <= "9":
            current += c
        else:
            if current != "":
                if operation:
                    res += int(current)
                else: 
                    res -= int(current)
            if c == "+":
                operation = True
            else:
                operation = False
            current = ""
    if current != "":
        if operation:
            res += int(current)
        else: 
            res -= int(current)
    return res
print(calculate(s))
