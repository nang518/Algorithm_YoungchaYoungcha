n = int(input())
arr = [int(input()) for _ in range(n)]
arr.sort()

result = []
for i in range(n):
    cnt = 0
    for j in range(arr[i], arr[i]+5):
        if j not in arr:
            cnt +=1
    
    result.append(cnt)

print(min(result))