import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())

graph = []
for _ in range(n):
    graph.append(list(map(int,input().split())))

dx = [0,1]
dy = [1,0]

def dfs(x,y):
    visited[x][y] = True
    step = graph[x][y]

    if graph[x][y] == -1:
        print("HaruHaru")
        exit()
    
    for i in range(2):
        nx = x + dx[i] * step
        ny = y + dy[i] * step

        if (0<=nx<n) and (0<=ny<n):
            if not visited[nx][ny]:
                dfs(nx,ny)

visited = [[False]*n for _ in range(n)]
dfs(0,0)
print("Hing")