N,K = map(int,input().split())
arr = list(map(int,input().split()))
arr.sort()

day = 0
cnt = 0
min = min(arr)

for i in range(1,len(arr)):
    ##현재 개수가 직전 개수와 같거나 크고 최소 개수보다 크다면, 현재 개수를 직전 개수와 같아질 때까지 -
    if arr[i-1] <= arr[i] and min < arr[i]:
        while arr[i] > arr[i-1]:
            arr[i] -= 1
            cnt += 1
        day += 1
    
print(cnt, day)