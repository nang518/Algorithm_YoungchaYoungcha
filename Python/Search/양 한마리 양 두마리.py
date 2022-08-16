import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

dx = [0,0,-1,1]
dy = [1,-1,0,0]

T = int(input())

def dfs(x,y):
    graph[x][y] = True
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < H and 0 <= ny < W:
            if graph[nx][ny] == '#' and not visited[nx][ny]:
                dfs(nx,ny)
    
for _ in range(T):
    H,W = map(int,input().split())
    graph = []
    visited = [[False]*W for _ in range(H)]
    
    for _ in range(H):
        temp = list(input())
        graph.append(temp)
    
    cnt = 0
    for i in range(H):
        for j in range(W):
            if graph[i][j] == '#' and not visited[i][j]:
                dfs(i,j)
                cnt += 1

    print(cnt)