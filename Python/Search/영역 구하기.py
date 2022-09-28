import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

m,n,k = map(int,input().split())

graph = [[0]*n for _ in range(m)]
for _ in range(k):
    x1,y1,x2,y2 = map(int,input().split())

    for i in range(x1,x2):
        for j in range(y1,y2):
            graph[j][i] = 1

dx = [1,-1,0,0]
dy = [0,0,1,-1]

def dfs(x,y):
    visited[x][y] = True

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
    
        if (0<=nx<m) and (0<=ny<n):
            if not visited[nx][ny] and graph[nx][ny] == 0:
                group[len(group)-1] += 1
                dfs(nx,ny)

visited = [[False]*n for _ in range(m)]
group = list()

for i in range(m):
    for j in range(n):
        if not visited[i][j] and graph[i][j] == 0:
            group.append(1)
            dfs(i,j)

group.sort()
print(len(group))

for i in range(len(group)):
    print(group[i],end = ' ')