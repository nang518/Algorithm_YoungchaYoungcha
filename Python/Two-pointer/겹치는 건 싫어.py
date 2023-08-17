n,k = map(int,input().split())
a = list(map(int,input().split()))

count = [0] * (max(a)+1)
start,end = 0,0
cnt = 0
while end<n:
    if count[a[end]] < k:
        count[a[end]] += 1
        end += 1
    else:
        count[a[start]] -= 1
        start += 1

    cnt = max(cnt, end-start)

print(cnt)