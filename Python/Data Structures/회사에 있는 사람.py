n = int(input())

arr = set()

for _ in range(n):
    log = input().split()

    if log[1] == "enter":
        arr.add(log[0])
    else:
        arr.remove(log[0])
    
for name in sorted(arr, reverse=True):
    print(name)