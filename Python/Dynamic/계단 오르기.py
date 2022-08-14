import sys
input = sys.stdin.readline

N = int(input())
floor = [0]
for _ in range(N):
    floor.append(int(input()))

if N == 1:
    print(floor[1])
else:
    score = [0] * (N+1)
    score[1] = floor[1]
    score[2] = floor[1] + floor[2]
    for i in range(3,N+1):
        score[i] = max(floor[i]+floor[i-1]+score[i-3], floor[i]+score[i-2])
        
    print(score[N])