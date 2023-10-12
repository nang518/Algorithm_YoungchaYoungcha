import sys
input = sys.stdin.readline
from collections import deque

dx = [-1, -2, -2, -1, 1, 2, 2, 1]
dy = [2, 1, -1, -2, -2, -1, 1, 2]

def bfs(x,y,targetx,targety):
    que = deque()
    que.append((x,y))

    graph[x][y] = 1

    while que:
        x,y = que.popleft()
        

        if x == targetx and y == targety:
            print(graph[targetx][targety] -1)

        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < l and 0 <= ny < l:
                if graph[nx][ny] == 0:
                    que.append((nx, ny))
                    graph[nx][ny] = graph[x][y] + 1
                

t = int(input())

for _ in range(t):
    l = int(input())
    x,y = map(int, input().split())
    targetx, targety = map(int, input().split())

    graph = [[0] * l for _ in range(l)]

    bfs(x, y, targetx, targety)