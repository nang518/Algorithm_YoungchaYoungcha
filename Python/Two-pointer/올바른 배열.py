n = int(input())
arr = []
result = []

for _ in range(n):
    tmp = int(input())
    arr.append(tmp)

arr.sort()

for i in range(0,n):
    cnt = 0
    for j in range(arr[i], arr[i]+5):
        if j not in arr:
            cnt += 1
        
    result.append(cnt)

print(min(result))