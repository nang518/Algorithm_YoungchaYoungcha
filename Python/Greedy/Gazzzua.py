N = int(input())
arr = list(map(int,input().split()))

max = 0
ans = 0

for i in range(len(arr)-1,-1,-1):
    if arr[i] > max:
        max = arr[i]
    else:
        ans += max - arr[i]

print(ans)