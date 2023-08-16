n = int(input())

arr = [int(input()) for _ in range(n)]

cnt = 0
for i in range(n-2, -1, -1):
    if arr[i] >= arr[i+1]:
        cnt += arr[i]-arr[i+1]+1
        arr[i] = arr[i+1]-1

print(cnt)