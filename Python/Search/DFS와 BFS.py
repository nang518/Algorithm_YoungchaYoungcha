import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)
from collections import deque

n,m,v = map(int, input().split())

graph = [[] for _ in range(n+1)]
for _ in range(m):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(len(graph)):
    graph[i].sort()

def dfs(v):
    visited[v] = True
    print(v, end = ' ')

    for i in graph[v]:
        if not visited[i]:
            visited[i] = True
            dfs(i)

def bfs(v):
    visited[v] = True

    que = deque()
    que.append(v)

    while que:
        x = que.popleft()
        print(x, end = ' ')

        for i in graph[x]:
            if not visited[i]:
                visited[i] = True
                que.append(i)

visited = [False] * (n+1)
dfs(v)
print()
visited = [False] * (n+1)
bfs(v)