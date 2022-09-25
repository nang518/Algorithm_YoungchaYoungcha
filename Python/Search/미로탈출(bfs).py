#NxM 크기의 미로에서 동빈이의 위치는 (1,1)이며 출구는(N,M)의 위치에 존재한다.
#괴물이 있는 부분은 0, 없는 부분은 1로 표시
#탈출하기 위해 움직여야 하는 최소 칸의 개수

# 5 6
# 101010
# 111111
# 000001
# 111111
# 111111

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