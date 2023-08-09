n,m = map(int, input().split())

arr = []
result,d = [],0
for _ in range(n):
    arr.append(input())

for i in range(m):
    a,t,g,c = 0,0,0,0
    for j in range(n):
        if arr[j][i] == 'A':
            a+=1
        if arr[j][i] == 'T':
            t+=1
        if arr[j][i] == 'G':
            g+=1
        if arr[j][i] == 'C':
            c+=1
    
    if max(a,t,g,c) == a:
        result += 'A'
        d += c+g+t
    elif max(a,t,g,c) == c:
        result += 'C'
        d += a+t+g
    elif max(a,t,g,c) == g:
        result += 'G'
        d += a+t+c
    elif max(a,t,g,c) == t:
        result += 'T'
        d += a+g+c
    
print(''.join(result))
print(d)