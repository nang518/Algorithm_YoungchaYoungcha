n,k = map(int,input().split())

dp = [[0]*(k+1) for _ in range(n+1)]
weight = [0]
value = [0]

for i in range(n):
    w,h = map(int,input().split())
    weight.append(w)
    value.append(h)

for i in range(1,n+1):
    for j in range(k,0,-1):
        if j-weight[i] >= 0:
            dp[i][j] = max(dp[i-1][j], value[i]+dp[i-1][j-weight[i]])
        else:
            dp[i][j] = dp[i-1][j]

print(max(dp[n]))