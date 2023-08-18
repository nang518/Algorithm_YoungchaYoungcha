n,s = map(int,input().split())
a = list(map(int,input().split()))

length = 100001
total = 0
start,end = 0,0

while end<=n:
    if total >= s:
        length = min(length, end-start)
        total -= a[start]
        start += 1
    elif end == n:
        break
    else:
        total += a[end]
        end += 1

if length == 100001:
    print(0)
else:
    print(length)