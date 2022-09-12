import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

m,n = map(int,input().split())

graph = []
for _ in range(m):
    graph.append(list(map(int,input().split())))

dx = [1,-1,0,0,-1,-1,1,1]
dy = [0,0,1,-1,-1,1,-1,1]

def dfs(x,y):
    visited[x][y] = True

    for i in range(8):
        nx = x + dx[i]
        ny = y + dy[i]

        if (0<=nx<m) and (0<=ny<n):
            if not visited[nx][ny] and graph[nx][ny] == 1:
                dfs(nx,ny)

visited = [[False]*n for _ in range(m)]
cnt = 0

for i in range(m):
    for j in range(n):
        if not visited[i][j] and graph[i][j] == 1:
            cnt += 1
            dfs(i,j)

print(cnt)