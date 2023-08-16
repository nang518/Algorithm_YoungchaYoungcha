import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n,m = map(int,input().split())
graph = [list(input()) for _ in range(m)]

dx = [1,-1,0,0]
dy = [0,0,1,-1]

def dfs(x,y,cnt):
    visited[x][y] = True
    c = graph[x][y]

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0<=nx<m and 0<=ny<n:
            if graph[nx][ny] == c and not visited[nx][ny]:
                cnt = dfs(nx,ny,cnt+1)
    
    return cnt

visited = [[False]*n for _ in range(m)]
w=b=0

for i in range(m):
    for j in range(n): 
        if not visited[i][j]:
            if graph[i][j] == 'W':
                w += dfs(i,j,1) ** 2
            elif graph[i][j] == 'B':
                b += dfs(i,j,1) ** 2

print(w,b)