import sys
input = sys.stdin.readline
from collections import deque

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
        x,y = que.popleft()

        for i  in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if (0<=nx<n) and (0<=ny<m):
                if not visited[nx][ny] and graph[nx][ny] == '1':
                    visited[nx][ny] = True
                    distance[nx][ny] = distance[x][y] +1
                    que.append((nx,ny))
 

visited = [[False]*m for _ in range(n)]
distance = [[0]*m for _ in range(n)]

bfs(0,0)
print(distance[n-1][m-1])