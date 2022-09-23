import sys
from collections import deque
input = sys.stdin.readline

n,m = map(int,input().split())
graph = []

for _ in range(n):
    graph.append(list(input().strip()))

def bfs(x,y):
    visited[x][y] = True

    dx = [1,-1,0,0]
    dy = [0,0,1,-1]

    que = deque()
    que.append((x,y))

    distance[x][y] = 1

    while que:
        a,b = que.popleft()

        for i in range(4):
            nx = a + dx[i]
            ny = b + dy[i]
        
            if (0<=nx<n) and (0<=ny<m):
                if not visited[nx][ny] and graph[nx][ny] == '1':
                    visited[nx][ny] = True
                    distance[nx][ny] = distance[a][b] + 1
                    que.append((nx,ny))

                     

visited = [[False]*m for _ in range(n)]
distance = [[0]*m for _ in range(n)]

bfs(0,0)
print(distance[n-1][m-1])