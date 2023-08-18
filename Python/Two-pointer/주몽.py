n = int(input())
m = int(input())
a = list(map(int,input().split()))
a.sort()

start,end = 0,n-1
cnt = 0
while start<end:
    tmp = a[start]+a[end]
    if tmp == m:
        cnt += 1
    elif tmp < m:
        start += 1
        continue
    end -= 1

print(cnt)