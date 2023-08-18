n,k = map(int,input().split())
s = list(map(int,input().split()))

start,end = 0,0
ans,cnt = 0,0

while end<n:
    if cnt <= k:
        if s[end]%2:
            cnt += 1
        end += 1
    else:
        if s[start]%2:
            cnt -= 1
        start += 1
    
    ans = max(ans, end-start-cnt)

print(ans)