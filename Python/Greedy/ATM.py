n = int(input())
p = list(map(int,input().split()))
p.sort()

ans = 0
for i in range(n+1):
    ans += sum(p[:i])

print(ans)