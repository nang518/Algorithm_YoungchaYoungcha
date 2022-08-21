import sys
input = sys.stdin.readline

N = int(input())
arr = []
for _ in range(N):
    arr.append(int(input()))
arr.sort(reverse=True)

score = arr[0] + 1
result = 1

for i in range(1,N):
    if arr[i]+N >= score:
        result += 1
    score = max(score, arr[i]+i+1)

print(result)