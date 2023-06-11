n,m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

c = a+b
c.sort()

ans = ' '.join(map(str, c))
print(ans)