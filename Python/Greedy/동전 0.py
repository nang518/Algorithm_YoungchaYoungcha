n,k = map(int, input().split())

a = []
for _ in range(n):
    a.append(int(input()))

cnt = 0
for i in range(n-1, -1, -1):
    if k >= a[i]:
        cnt += k // a[i]
        k %= a[i]
    
    elif k == 0:
        break

print(cnt)