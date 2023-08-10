t = int(input())
for _ in range(t):
    n = int(input())
    dp = [1,1,2]
    for i in range(3,n+1):
        dp.append(dp[i-1]+dp[i-2]+dp[i-3])

    print(dp[n])