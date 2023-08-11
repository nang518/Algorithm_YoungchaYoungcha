import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

dx = [1,-1,0,0,-1,-1,1,1]
dy = [0,0,1,-1,1,-1,1,-1]

def dfs(x,y):
    visited[x][y] = True

    for i in range(8):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0<=nx<h and 0<=ny<w:
            if graph[nx][ny]==1 and not visited[nx][ny]:
                dfs(nx,ny)

while True:
    w,h = map(int,input().split())

    if w==0 and h==0:
        break

    graph = []
    visited = [[False]*w for _ in range(h)]
    for _ in range(h):
        graph.append(list(map(int,input().split())))
    
    cnt = 0
    for i in range(h):
        for j in range(w):
            if graph[i][j] == 1 and not visited[i][j]:
                dfs(i,j)
                cnt += 1

    print(cnt)