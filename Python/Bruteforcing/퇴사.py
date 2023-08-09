n = int(input())
t,p = [],[]
for _ in range(n):
    a,b = map(int,input().split())
    t.append(a)
    p.append(b)

ans = 0
def dfs(x,y):
    global ans
    
    if x==n:
        if ans < y:
            ans = y
        return

    if x>n:
        return

    dfs(x+t[x], y+p[x]) #x일 선택
    dfs(x+1, y) #선택 x

dfs(0,0)
print(ans)