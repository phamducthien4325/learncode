s = input()

def count_A(s: str) -> int:
    cnt = 0
    for c in s:
        if c == 'A':
            cnt += 1
    return cnt

print(count_A(s))
