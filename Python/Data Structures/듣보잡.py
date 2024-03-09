n,m = map(int, input().split())

a = set()
b = set()

for _ in range(n):
    a.add(input())

for _ in range(m):
    b.add(input())

c = list(a & b)
c.sort()

print(len(c))

for i in c:
    print(i)