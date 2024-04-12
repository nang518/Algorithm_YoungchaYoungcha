from collections import deque

def bfs(x,y):
    global cnt
    que = deque()
    que.append((x,y))
    visited[x][y] = True
    cnt = 1

    while que:
        x,y = que.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < n:
                if not visited[nx][ny] and graph[nx][ny] != 0:
                    visited[nx][ny] = True
                    que.append((nx,ny))
                    cnt += 1
                    
n = int(input())

graph = []
for _ in range(n):
    graph.append(list(map(int, input().strip())))

visited = [[False] * n for _ in range(n)]
result = []

dx = [1,-1,0,0]
dy = [0,0,1,-1]

for i in range(n):
    for j in range(n):
        if graph[i][j] != 0 and not visited[i][j]:
            cnt = 0
            bfs(i,j)
            result.append(cnt)

print(len(result))
result.sort()
for i in result:
    print(i)