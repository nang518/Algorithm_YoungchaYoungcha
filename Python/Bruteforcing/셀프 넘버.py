arr = list(range(1,10001))
remove = []

for i in arr:
    for j in str(i):
        i += int(j)

    if i <= 10000:
        remove.append(i)

for i in set(remove):
    arr.remove(i)

for i in arr:
    print(i)
        