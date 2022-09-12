import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

r,c = map(int,input().split())

graph = []
for _ in range(r):
    graph.append(list(input().strip()))


dx = [1,-1,0,0]
dy = [0,0,1,-1]

def dfs(x,y):
    global wolf,sheep
    visited[x][y] = True

    if graph[x][y] == 'v':
        wolf += 1
    if graph[x][y] == 'k':
        sheep += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if (0<=nx<r) and (0<=ny<c) and graph[nx][ny] != '#':
            if not visited[nx][ny]:
                dfs(nx,ny)

visited = [[False] * c for _ in range(r)]

wolf_cnt, sheep_cnt = 0,0

for i in range(r):
    for j in range(c):
        if graph[i][j] != '#' and not visited[i][j]:
            wolf,sheep = 0,0
            dfs(i,j)

            if wolf >= sheep:
                wolf_cnt += wolf
            if sheep > wolf:
                sheep_cnt += sheep

print(sheep_cnt, wolf_cnt)