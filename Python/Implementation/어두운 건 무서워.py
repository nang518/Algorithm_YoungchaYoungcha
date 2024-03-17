import sys
input = sys.stdin.readline

r,c,q = map(int, input().split())
k = []
prefixSum = [[0] * (c+1) for _ in range(r+1)]

for _ in range(r):
    tmp = list(map(int, input().split()))
    k.append(tmp)

for i in range(1, r+1):
    for j in range(1, c+1):
        prefixSum[i][j] = prefixSum[i-1][j] + prefixSum[i][j-1] - prefixSum[i-1][j-1] + k[i-1][j-1]

for i in range(q):
    r1,c1,r2,c2 = map(int, input().split())

    ans = prefixSum[r2][c2] - prefixSum[r1-1][c2] - prefixSum[r2][c1-1] + prefixSum[r1-1][c1-1]
    cnt = (r2-r1+1) * (c2-c1+1)

    result = ans // cnt

    print(result)

print(prefixSum)