import sys
input = sys.stdin.readline
from collections import deque

t = int(input())

dx = [-1,1,0,0]
dy = [0,0,-1,1]

# bfs
def bfs(x,y):
    que = deque()
    que.append((x,y))

    while que:
        x,y = que.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            if graph[nx][ny] == 1:
                que.append((nx,ny))
                graph[nx][ny] = 0

#입력
for _ in range(t):
    m,n,k = map(int, input().split())
    graph = [[0]*m for _ in range(n)]
    cnt = 0

    for _ in range(k):
        x,y = map(int, input().split())
        graph[y][x] = 1
    
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 1:
                bfs(i,j)
                cnt += 1
    
    print(cnt)