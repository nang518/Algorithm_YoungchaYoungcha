n = int(input())
p = list(map(int,input().split()))

p.sort()

pre = 0
min = 0

for i in range(0,n):
    min += pre + p[i]
    pre += p[i]

print(min)