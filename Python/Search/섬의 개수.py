import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline

dx = [1,0,-1,0,-1,-1,1,1]
dy = [0,1,0,-1,-1,1,-1,1]

def dfs(x,y):
    visited[x][y] = True
    
    for i in range(8):
        nx = x + dx[i]
        ny = y + dy[i]
    
        if 0<=nx<h and 0<=ny<w:
            if graph[nx][ny] == 1 and not visited[nx][ny]:
                dfs(nx,ny)

while True:
    w,h = map(int,input().split())
    graph = []
    visited = [[False] * w for _ in range(h)]
    if w == 0 and h == 0:
        break
    
    cnt = 0
    for _ in range(h):
        temp = list(map(int,input().split()))
        graph.append(temp)
    
    for i in range(h):
        for j in range(w):
            if graph[i][j] == 1 and not visited[i][j]:
                dfs(i,j)
                cnt+=1
    
    print(cnt)