import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())

graph = []
for _ in range(n):
    graph.append(list(input().strip()))

dx = [-1,1,0,0]
dy = [0,0,1,-1]

def dfs(x,y):
    visited[x][y] = True
    color = graph[x][y] 

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0<=nx<n and 0<=ny<n:
            if not visited[nx][ny] and graph[nx][ny] == color:
                dfs(nx,ny)

visited = [[False]*n for _ in range(n)]
cnt = 0

for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            cnt += 1
            dfs(i,j)

visited = [[False]*n for _ in range(n)]
blind = 0

for i in range(n):
    for j in range(n):
        if graph[i][j] == 'G':
            graph[i][j] = 'R'

for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            blind += 1
            dfs(i,j)

print(cnt, blind)