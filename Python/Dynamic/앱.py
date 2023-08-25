n,m = map(int,input().split()) # n: 현재 활성화 앱 수, m: 추가로 필요한 메모리
a = [0] + list(map(int,input().split())) # 현재 활성화 바이트 수
c = [0] + list(map(int,input().split())) # 비활성화 비용

cost = sum(c)
ans = cost
dp = [[0] * (cost+1) for _ in range(n+1)]

# 비용 최소화
for i in range(1,n+1):
    for j in range(cost):
        # 현재 앱의 비용이 더 큰 경우, 앱 비활성화 x
        if c[i] > j:
            dp[i][j] = dp[i-1][j]
        # 비활성화가 가능한 경우 
        else:
            dp[i][j] = max(dp[i-1][j], a[i]+dp[i-1][j-c[i]])
    
        # 필요한 메모리 이상을 확보한 경우 
        if dp[i][j] >= m:
            ans = min(ans, j)

print(ans)