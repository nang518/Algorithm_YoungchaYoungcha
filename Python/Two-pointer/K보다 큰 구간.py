n = int(input())
arr = list(map(int,input().split()))
k = int(input())

# 시간 초과
# cnt = 0
# for i in range(n):
#     total = 0
#     for j in range(i,n):
#         total += arr[j]
#         if total > k:
#             cnt += 1

# print(cnt)

start,end = 0,0
cnt = 0
total = 0

while True:
    if end == n:
        if total > k:
            cnt += 1
            total -= arr[start]
            start += 1
        else:
            break
        continue
    if total <= k:
        total += arr[end]
        end += 1
    else:
        cnt += n-end+1 # K를 넘었으면 그 뒤는 무조건 K를 넘는다.
        total -= arr[start]
        start += 1
    
print(cnt)