import sys
input = sys.stdin.readline

N = int(input())

DP = []
for _ in range(N):
    DP.append(list(map(int,input().strip().split())))

for i in range(1,N):
    DP[i][0] = DP[i][0] + min(DP[i-1][1],DP[i-1][2])
    DP[i][1] = DP[i][1] + min(DP[i-1][0],DP[i-1][2])
    DP[i][2] = DP[i][2] + min(DP[i-1][0],DP[i-1][1])

print(min(DP[N-1]))