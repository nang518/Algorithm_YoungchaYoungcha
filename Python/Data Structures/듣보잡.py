n,m = map(int, input().split())

a = set()
b = set()

for _ in range(n):
    a.add(input().strip())

for _ in range(m):
    b.add(input().strip())

result = list(a & b)
result.sort()

print(len(result))

for name in result:
    print(name)