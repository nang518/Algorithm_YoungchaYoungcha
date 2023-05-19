n = int(input())

arr = []
for i in range(n):
    arr.append(input())

# 중복 제거
arr = set(arr)
arr = list(arr)
arr.sort()
arr.sort(key = len)

for i in arr:
    print(i)
