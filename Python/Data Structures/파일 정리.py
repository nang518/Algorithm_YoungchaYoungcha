n = int(input())

file = {}

for _ in range(n):
    name = list(input().split('.'))

    if name[1] not in file:
        file[name[1]] = 1
    
    else:
        file[name[1]] += 1

for i in sorted(file.items()):
    print(*i)