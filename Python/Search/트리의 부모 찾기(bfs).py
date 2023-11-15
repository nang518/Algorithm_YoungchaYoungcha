from collections import deque
import sys
input = sys.stdin.readline

n = int(input())

graph = [[] for _ in range(n+1)]

for _ in range(n-1):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

def bfs(v):
    visited[v] = True

    que = deque()
    que.append(v)

    while que:
        x = que.popleft()

        for i in graph[x]:
            if not visited[i]:
                visited[i] = True
                parent[i] = x
                que.append(i)

visited = [False] * (n+1)
parent = [0] * (n+1)
bfs(1)

for i in range(2, n+1):
    print(parent[i])