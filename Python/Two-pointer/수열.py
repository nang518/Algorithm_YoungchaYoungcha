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

# ans = total = sum(c[:k])
# for i in range(k,n):
#     total += c[i]-c[i-k]
#     ans = max(total, ans) 

#print(ans)