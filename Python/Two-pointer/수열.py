n,k = map(int,input().split())
c = list(map(int,input().split()))

# start,end = 0,0
# total,cnt = 0,0
# ans = 0

# while end<=n:
#     if cnt == k:
#         ans = max(ans,total)
#         total -= c[start]
#         start += 1
#         cnt -= 1
#     elif end == n:
#         break
#     else:
#         total += c[end]
#         end += 1
#         cnt += 1

ans = total = sum(c[:k])
for i in range(k,n):
    total += c[i]-c[i-k]
    ans = max(total, ans) 

print(ans)