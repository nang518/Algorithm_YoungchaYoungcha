from collections import deque

def bfs(x,y):
    visited[x][y] = True

    que = deque()
    que.append((x,y))

    dx = [1,-1,0,0,-1,-1,1,1]
    dy = [0,0,1,-1,-1,1,1,-1]

    while que:
        x,y = que.popleft()

        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]

            if (0<=nx<h) and (0<=ny<w):
                if not visited[nx][ny] and graph[nx][ny] == 1:
                    visited[nx][ny] = True
                    que.append((nx,ny))

while True:
    w,h = map(int,input().split())

    if w==0 and h==0:
        break

    graph = []
    for _  in range(h):
        graph.append(list(map(int,input().split())))
    
    visited = [[False]*w for _ in range(h)]

    cnt = 0
    for i in range(h):
        for j in range(w):
            if not visited[i][j] and graph[i][j] == 1:
                bfs(i,j)
                cnt += 1
    
    print(cnt)