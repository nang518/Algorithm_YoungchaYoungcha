x,y = map(int, input().split())
k = int(input())

w,h = [0,x], [0,y]

for _ in range(k):
    a,b = map(int, input().split())

    if a == 0:
        h.append(b)
    
    else:
        w.append(b)

w.sort()
h.sort()

ans = 0

for i in range(len(w)-1):
    for j in range(len(h)-1):
        width = w[i+1] - w[i]
        height = h[j+1] - h[j]

        ans = max(ans, width * height)
    
print(ans)