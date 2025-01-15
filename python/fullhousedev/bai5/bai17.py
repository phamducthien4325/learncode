s = input()
k = int(input())
m = 9
cnt = 0
for i in range(len(s) - k):
    if int(s[i]) < m:
        m = int(s[i])
        cnt = 1
    elif int(s[i]) == m:
        cnt += 1
print(m, cnt)
if cnt >= len(s) - k:
    print(str(m) * k)
i = 0
cnt = 0
while i < len(s) and cnt < k:
    if int(s[i]) > m:
        s = s[:i] + s[i + 1:]
        cnt += 1
    i += 1
print(s)
