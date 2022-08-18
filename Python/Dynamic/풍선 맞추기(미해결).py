import sys
input = sys.stdin.readline

N = int(input())
H = list(map(int,input().split()))

cnt = [0] * (N+1)

for i in H:
    if cnt[i] > 0:
        cnt[i] -= 1
        cnt[i-1] += 1
    else:
        cnt[i-1] += 1

print(sum(cnt))