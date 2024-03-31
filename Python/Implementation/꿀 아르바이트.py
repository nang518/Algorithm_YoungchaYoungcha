import sys
input = sys.stdin.readline

n,m = map(int, input().split())
t = list(map(int, input().split()))

prefixSum = [0] * (n+1)
result = []

for i in range(1, n+1):
    prefixSum[i] = prefixSum[i-1] + t[i-1]

for i in range(m, n+1):
    result.append(prefixSum[i] - prefixSum[i-m])

print(max(result))