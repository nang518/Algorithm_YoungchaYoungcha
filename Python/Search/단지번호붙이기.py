import sys
input = sys.stdin.readline
from collections import deque

n = int(input())

graph = []
for _ in range(n):
    graph.append(list(input().strip()))

def bfs(x,y):
    global cnt
    visited[x][y] = True

    dx = [1,-1,0,0]
    dy = [0,0,1,-1]

    que = deque()
    que.append((x,y))

    while que:
        x,y = que.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
        
            if (0<=nx<n) and (0<=ny<n):
                if not visited[nx][ny] and graph[nx][ny] == '1':
                    visited[nx][ny] = True
                    

visited = [[False]*n for _ in range(n)]
cnt = 1

for i in range(n):
    for j in range(n):
        if not visited[i][j] and graph[i][j] == '1':
            bfs(i,j)
            cnt += 1
    
    print(cnt)

