from collections import deque
import sys
input = sys.stdin.readline

def bfs(x,y):
    que = deque()
    que.append((x,y))
    graph[x][y] = 1
    cnt = 1

    while que:
        x,y = que.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < m and 0 <= ny < n:
                if graph[nx][ny] == 0:
                    graph[nx][ny] = 1
                    que.append((nx,ny))
                    cnt += 1
    
    result.append(cnt)


m,n,k = map(int, input().split())

graph = [[0] * n for _ in range(m)]

for _ in range(k):
    x1,y1,x2,y2 = map(int, input().split())

    for i in range(x1,x2):
        for j in range(y1,y2):
            graph[j][i] = 1

dx = [0,0,1,-1]
dy = [1,-1,0,0]

result = []
for i in range(m):
    for j in range(n):
        if graph[i][j] == 0:
            bfs(i,j)

result.sort()
print(len(result))

for i in result:
    print(i, end = ' ')