import sys
input = sys.stdin.readline

n,x = map(int, input().split())
arr = list(map(int, input().split()))

prefixSum = [0] * (n+1)

for i in range(1, n+1):
    prefixSum[i] = prefixSum[i-1] + arr[i-1]

cnt = 0
max = 0

for i in range(x, n+1):
    tmp = prefixSum[i] - prefixSum[i-x]

    if (max == tmp) and (max != 0):
        cnt += 1

    if max < tmp:
        max = tmp
        cnt = 1
    
if cnt == 0:
    print("SAD")

else:
    print(max)
    print(cnt)