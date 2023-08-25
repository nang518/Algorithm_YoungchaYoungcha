import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int,input().split()))
a.sort()

ans = sys.maxsize
x,y,z = 0,0,0
for i in range(n-2):
    start,end = i+1, n-1
    while start < end:
        total = a[i] + a[start] + a[end]
        if abs(total) < ans:
            ans = abs(total)
            x, y, z = a[i], a[start], a[end]
        
        if total < 0:
            start += 1
        else:
            end -= 1
        
print(x,y,z)