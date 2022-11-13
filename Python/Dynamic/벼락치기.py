import sys
input = sys.stdin.readline

n,t = map(int,input().split())
times = [0]
scores = [0]
for _ in range(n):
    k,s = map(int,input().split())
    times.append(k)
    scores.append(s)

dp = [[0]*(t+1) for _ in range(n+1)]
for i in range(1,n+1):
    for j in range(1,t+1):
        if j>=times[i]:
            dp[i][j] = max(dp[i-1][j], dp[i-1][j-times[i]]+scores[i])
        else:
            dp[i][j] = dp[i-1][j]

print(dp[n][t])