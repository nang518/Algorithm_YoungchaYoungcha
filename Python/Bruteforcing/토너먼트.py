n,k,l = map(int, input().split())

cnt = 0
while k != l:
    k -= k//2
    l -= l//2
    cnt += 1

if cnt==0:
    print(-1)
else:
    print(cnt)