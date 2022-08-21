import sys
input = sys.stdin.readline

N,K = map(int,input().split())
arr = []
for _ in range(N):
    arr.append(int(input()))

diff = []
for i in range(len(arr)-1):
    diff.append(arr[i+1]-arr[i])
diff.sort()

result = 0
for i in range(0,N-K):
    result += diff[i]

print(result+K)