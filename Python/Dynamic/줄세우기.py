n = int(input())
dp = [0] * n

line = []
for i in range(n):
    line.append(int(input()))

dp[0] = 1
for i in range(1,n):
    a = []
    for j in range(i):
        if line[i] > line[j]:
            a.append(dp[j])
        
        if not a:
            dp[i]=1
        else:
            dp[i] = max(a) + 1

print(n-max(dp))