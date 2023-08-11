import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n,m = map(int,input().split())
graph = []
for _ in range(n):
    tmp = list(map(int,input().split()))
    graph.append(tmp)

dx = [1,-1,0,0]
dy = [0,0,1,-1]

def dfs(x,y):
    global w
    visited[x][y] = True
    w += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0<=nx<n and 0<=ny<m:
            if not visited[nx][ny] and graph[nx][ny]==1:
                dfs(nx,ny)
                
            
visited = [[False]*m for _ in range(n)]

arr = []
cnt = 0
for i in range(n):
    for j in range(m):
        w = 0 
        if graph[i][j] == 1 and not visited[i][j]:
            dfs(i,j)
            cnt += 1
        arr.append(w)

print(cnt)
if len(arr) == 0:
    print(0)
else:
    print(max(arr))