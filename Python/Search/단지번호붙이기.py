import sys
input = sys.stdin.readline
sys,sys.setrecursionlimit(10**6)

n = int(input())

graph = []
for _ in range(n):
    tmp = list(map(int, input().strip()))
    graph.append(tmp)

dx = [-1,1,0,0]
dy = [0,0,-1,1]

def dfs(x,y):
    global num
    visited[x][y] = True
    num += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if (0<=nx<n) and (0<=ny<n):
            if graph[nx][ny] != 0 and not visited[nx][ny]:
                dfs(nx,ny)

visited = [[False]*n for _ in range(n)]

num = 0
result = []

for i in range(n):
    for j in range(n):
        if graph[i][j] != 0 and not visited[i][j]:
            num = 0
            dfs(i,j)      
            result.append(num)

print(len(result))
result.sort()
for i in result:
    print(i)