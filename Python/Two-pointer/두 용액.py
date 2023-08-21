import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int,input().split()))
arr.sort()

start,end = 0, n-1
ans = sys.maxsize
x,y = 0,0

while start < end:
    total = arr[start] + arr[end]
    if abs(total) < ans:
        ans = abs(total)
        x,y = arr[start], arr[end]

    if total < 0:
        start += 1
    else:
        end -= 1

print(x,y)