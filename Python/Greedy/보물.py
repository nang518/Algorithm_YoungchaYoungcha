n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

ans = 0

for _ in range(n):
    ans += max(a) * min(b)
    a.remove(max(a))
    b.remove(min(b))

print(ans)