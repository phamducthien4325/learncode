s = input()
d = dict({})
for c in s:
    if c == " ":
        continue
    if c not in d:
        d[c] = 1
    else:
        d[c] += 1
d = dict(sorted(d.items()))
for k, v in d.items():
    print(f"{k} {v}")
