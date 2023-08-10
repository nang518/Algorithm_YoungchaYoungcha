n = int(input())

dp = [0]
for _ in range(n):
    dp.append(int(input()))

if n==1:
    print(dp[1])
else:
    score = [0] * (n+1)
    score[1] = dp[1]
    score[2] = dp[1] + dp[2]
    for i in range(3,n+1):
        score[i] = max(dp[i]+dp[i-1]+score[i-3], dp[i]+score[i-2])
    
    print(score[n])