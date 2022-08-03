n,l = map(int,input().split())
arr = list(map(int,input().split()))

arr.sort()

ans = 0
point = 0

for i in range(len(arr)):
    if(point == 0 or point + l < arr[i]):
        ans += 1
        point = arr[i] - 0.5

print(ans)