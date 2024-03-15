import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
m = int(input())

prefixSum = [0] * (n+1)

for i in range(1, n+1):
    prefixSum[i] = prefixSum[i-1] + a[i-1]

for _ in range(m):
    i,j = map(int, input().split())

    ans = prefixSum[j] - prefixSum[i-1]

    print(ans)