n,k = map(int,input().split())
c = list(map(int,input().split()))

start,end = 0,k-1
total,cnt = sum(c[:k]),k
ans = total

while end<n-1:
    total -= c[start]
    start += 1
    end += 1
    total += c[end]

    ans = max(ans, total)

print(ans)