from collections import deque
import sys
input = sys.stdin.readline

def bfs(x,y):
    que = deque()
    que.append((x,y))
    graph[x][y] = 1

    while que:
        x,y = que.popleft()

        for i in range(6):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx == r2 and ny == c2:
                return graph[x][y]

            if 0 <= ny < n and 0 <= nx < n:
                if graph[nx][ny] == 0:
                    que.append([nx,ny])
                    graph[nx][ny] = graph[x][y] +1
    
    return -1

n = int(input())
r1,c1,r2,c2 = map(int, input().split())

dx = [-2,-2,0,0,2,2]
dy = [-1,1,-2,2,-1,1]

graph = [[0] * n for _ in range(n)]

print(bfs(r1,c1))