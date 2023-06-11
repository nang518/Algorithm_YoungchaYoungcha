import sys
input = sys.stdin.readline

n,s = map(int, input().split())
cows = []
for _ in range(n):
    tmp = int(input())
    cows.append(tmp)

cnt = 0
for i in range(n):
    for j in range(0, i):
        if cows[i]+cows[j] <= s:
            cnt += 1

print(cnt)