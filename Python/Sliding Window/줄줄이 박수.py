n,m = map(int, input().split())

arr = []
for _ in range(n):
    q = list(map(int, input().split()))
    arr.append(q)

sumArr = [0] * m
for i in range(n):
    for j in range(m):
        sumArr[j] += arr[i][j]

a = int(input())

total = sum(sumArr[:a])
maxTotal = total

for i in range(a, m):
    total = total + sumArr[i] - sumArr[i-a]

    if total > maxTotal:
        maxTotal = total

print(maxTotal)