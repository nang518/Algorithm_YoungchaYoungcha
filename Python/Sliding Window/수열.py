n,k = map(int, input().split())
a = list(map(int, input().split()))

result = []
result.append(sum(a[:k]))

for i in range(n-k):
    x = result[i] - a[i] + a[i+k]
    result.append(x)

print(max(result))