l = list(input().split())
res = ""
for item in l:
    if len(item) > len(res):
        res = item
print(res)
