import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

r,c,k = map(int, input().split())
graph = [list(input()) for _ in range(r)]

dx = [1,-1,0,0]
dy = [0,0,1,-1]

def dfs(x,y,d):
    global cnt
    visited[x][y] = True
    if d == k and x == 0 and y == c-1:
        cnt += 1
        return

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0<=nx<r and 0<=ny<c and graph[nx][ny] != 'T' and not visited[nx][ny]:
            dfs(nx,ny,d+1)
            visited[nx][ny] = False

visited = [[False]*c for _ in range(r)]
cnt = 0
dfs(r-1,0,1)
print(cnt)