import sys
input = sys.stdin.readline

n = int(input())
m = int(input())

vip = []
for _ in range(m):
    vip.append(int(input()))


dp = [1,1,2]

for i in range(3,n+1):
    dp.append(dp[i-1]+dp[i-2])

ans = 1
if m > 0:
    temp = 0
    for i in range(m):
        ans *= dp[vip[i]-1-temp]
        temp = vip[i]
    ans *= dp[n-temp]
else:
    ans = dp[n]
print(ans)