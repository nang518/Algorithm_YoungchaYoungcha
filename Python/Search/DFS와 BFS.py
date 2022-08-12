from collections import deque

N,M,V = map(int,input().split())
visited = [False] * (N+1)

graph = [[] for _ in range(N+1)]

for _ in range(M):
    x,y = map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)

for i in range(len(graph)):
    graph[i].sort()

#dfs
def dfs(v):
    visited[v] = True
    print(v, end=' ')

    for i in graph[v]:
        if not visited[i]:
            dfs(i)
            visited[i] = True

#bfs
def bfs(start):
    queue = deque([start])
    visited[start] = True
    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

dfs(V)
print()
visited = [False] * (N+1)
bfs(V)