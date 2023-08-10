import sys
input = sys.stdin.readline

n = int(input())
m = int(input()) #고정좌석 (vip)
vip = []
for _ in range(m):
    vip.append(int(input()))

dp = [1,1,2]
for i in range(3,n+1):
    dp.append(dp[i-1]+dp[i-2])

ans = 1
if m>0: #vip가 있는 경우
    tmp = 0
    for i in vip:
        ans *= dp[i-1-tmp]
        tmp = i
    ans *= dp[n-tmp]
else: #없는 경우
    ans = dp[n]

print(ans)