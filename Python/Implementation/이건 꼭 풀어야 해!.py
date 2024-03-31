import sys
input = sys.stdin.readline

n,q = map(int, input().split())
a = list(map(int, input().split()))

a.sort()

prefixSum = [0] * (n+1)

for i in range(1, n+1):
    prefixSum[i] = prefixSum[i-1] + a[i-1]

for _ in range(q):
    l,r = map(int, input().split())

    ans = prefixSum[r] - prefixSum[l-1]

    print(ans)