n,m = map(int, input().split())
a = list(map(int, input().split()))

for _ in range(m):
    a.sort()
    hap = a[0] + a[1]

    a[0] = hap
    a[1] = hap

total = 0

for i in a:
    total += i

print(total)