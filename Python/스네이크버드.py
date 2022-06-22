n,l = map(int, input().split())
h = list(map(int, input().split()))
h.sort()

for i in range(len(h)):
    if l >= h[i]:
        l += 1

print(l)