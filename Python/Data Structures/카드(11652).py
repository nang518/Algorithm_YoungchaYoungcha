n = int(input())

arr = {}
for _ in range(n):
    tmp = int(input())

    if tmp in arr:
        arr[tmp] += 1

    else:
        arr[tmp] = 1

max = 0

for i in sorted(arr):
    if arr[i] > max:
        max = arr[i]
        result = i

print(result)