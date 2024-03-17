n,k = map(int, input().split())
a = list(map(int, input().split()))

prefixSum = [0] * n
prefixSum[0] = a[0]

for i in range(1, n):
    prefixSum[i] = prefixSum[i-1] + a[i]

prefixSum.sort(reverse = True)

print(sum(prefixSum[:k]))