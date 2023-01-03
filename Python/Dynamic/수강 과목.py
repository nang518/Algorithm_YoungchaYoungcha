import sys
input = sys.stdin.readline

n,k = map(int,input().split())
dp = [[0]*(n+1) for _ in range(k+1)]

times = []
values = []
for _ in range(k):
    i,t = map(int,input().split())
    times.append(t)
    values.append(i)

for i in range(1,k+1):
    for j in range(1,n+1):
        if times[i-1] > j:
            dp[i][j] = dp[i-1][j]
        else:
            dp[i][j] = max(dp[i-1][j], dp[i-1][j-times[i-1]]+values[i-1])

print(dp[k][n])