n = int(input())
a = list(map(int,input().split()))
x = int(input())
a.sort()

start,end = 0,n-1
cnt = 0
while start<end:
    tmp = a[start]+a[end]
    if tmp == x:
        cnt += 1
    elif tmp < x:
        start += 1
        continue
    end -= 1

print(cnt)