s = input()

def count_number(s: str)-> int:
    cnt = 0
    for c in s:
        if '0' <= c <= '9':
            cnt += 1
    return cnt

print(count_number(s))
