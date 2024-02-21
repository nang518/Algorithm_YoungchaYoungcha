n = int(input())

arr = []
for _ in range(n):
    arr.append(input())

arr = set(arr)
arr = list(arr)

arr.sort()
arr.sort(key = len)

for i in arr:
    print(i)