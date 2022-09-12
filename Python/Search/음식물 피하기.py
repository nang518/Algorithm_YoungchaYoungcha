import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n,m,k = map(int,input().split())

graph = [[0]*m for _ in range(n)]
for _ in range(k):
    a,b = map(int,input().split())
    graph[a-1][b-1] = 1

dx = [1,-1,0,0]
dy = [0,0,1,-1]

def dfs(x,y):
    global cnt
    visited[x][y] = True

    if graph[x][y] == 1:
        cnt += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if (0<=nx<n) and (0<=ny<m):
            if not visited[nx][ny] and graph[nx][ny] == 1:
                dfs(nx,ny)

visited = [[False]*m for _ in range(n)]
max_cnt = 0

for i in range(n):
    for j in range(m):
        if graph[i][j] == 1 and not visited[i][j]:
            cnt = 0
            dfs(i,j)
            max_cnt = max(max_cnt,cnt)

print(max_cnt)