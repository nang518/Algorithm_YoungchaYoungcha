d,k = map(int,input().split())
dp = [0] * 31

dp[1] = (1,0)
dp[2] = (0,1)
for i in range(3,d+1):
    dp[i] = (dp[i-1][0]+dp[i-2][0], dp[i-1][1]+dp[i-2][1])

a = dp[d][0]
b = dp[d][1]

x,y = 1,1
while True:
    if a*x + b*y == k:
        print(x,y, sep='\n')
        break
    elif a*x + b*y < k:
        y += 1
    else:
        x += 1
        y = 1