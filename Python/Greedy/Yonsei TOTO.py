import sys
input = sys.stdin.readline

n,m = map(int, input().split())
result = []

for _ in range(n):
    p,l = map(int, input().split())
    point = list(map(int, input().split()))

    point.sort(reverse=True)

    if p < l: 
        result.append(1)
    else:
        result.append(point[l-1])
    
result.sort()

cnt = 0
for p in result:
    if m - p >= 0:
        cnt += 1
        m -= p

print(cnt)