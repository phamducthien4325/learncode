s = input()

def to_upper(s: str): 
    ket_qua = ""
    for c in s:
        if 'a' <= c and c <= 'z':
            c = chr(ord(c) - 32)
        ket_qua += c
    return ket_qua

a = to_upper(s)
print(a)
