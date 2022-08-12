#NxM 크기의 미로에서 동빈이의 위치는 (1,1)이며 출구는(N,M)의 위치에 존재한다.
#괴물이 있는 부분은 0, 없는 부분은 1로 표시
#탈출하기 위해 움직여야 하는 최소 칸의 개수

# 5 6
# 101010
# 111111
# 000001
# 111111
# 111111

from collections import deque

def bfs(x,y):
    queue = deque()
    queue.append((x,y))

    while queue:
        x,y = queue.popleft()
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]

            if nx<0 or nx>=N or ny < 0 or ny>=M:
                continue
            if graph[nx][ny] == 0:
                continue
            if graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] +1
                queue.append((nx,ny)) 
    return graph[N-1][M-1]

N,M = map(int,input().split())
graph = []
for i in range(N):
    graph.append(list(map(int,input())))

dx = [-1,1,0,0]
dy = [0,0,-1,1]

print(bfs(0,0)) 