from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
pair = int(input())

graph = [[] for _ in range(n+1)]
for _ in range(pair):
    x,y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

def bfs(v):
    global cnt
    visited[v] = True

    que = deque()
    que.append(v)

    while que:
        x = que.popleft()

        for i in graph[x]:
            if not visited[i]:
                visited[i] = True
                cnt += 1
                que.append(i)

visited = [False] * (n+1)
cnt = 0
bfs(1)
print(cnt)