n,k = map(int,input().split())
c = list(map(int,input().split()))

ans = total = sum(c[:k])
for i in range(k,n):
    total += c[i]-c[i-k]
    ans = max(total, ans) 
    
print(ans)