import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())
graph = []
max_num = 0
for i in range(n):
    tmp = list(map(int,input().split()))
    graph.append(tmp)

    for j in tmp:
        if j > max_num:
            max_num = j

dx = [1,-1,0,0]
dy = [0,0,1,-1]

def dfs(x,y,h):
    visited[x][y] = True

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0<=nx<n and 0<=ny<n:
            if not visited[nx][ny] and graph[nx][ny] > h:
                dfs(nx,ny,h)

ans = 1
for x in range(max_num):
    visited = [[False]*n for _ in range(n)]
    cnt = 0

    for i in range(n):
        for j in range(n):
            if not visited[i][j] and graph[i][j] > x:
                cnt += 1
                dfs(i,j,x)
    
    ans = max(ans, cnt)

print(ans)