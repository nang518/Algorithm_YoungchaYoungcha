n,k,b = map(int, input().split())
arr = [i for i in range(1, n+1)]

for i in range(b):
    x = int(input())
    arr[x-1] = -1

result = 0
for i in range(k):
    if arr[i] == -1:
        result += 1

cnt = result
for i in range(1, n-k+1):
    if arr[i-1] == -1:
        cnt -= 1
    
    if arr[i+k-1] == -1:
        cnt += 1
    
    result = min(result, cnt)

print(result)