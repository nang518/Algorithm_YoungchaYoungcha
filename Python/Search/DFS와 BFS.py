import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)
from collections import deque

n,m,v = map(int,input().split())

graph =[[] for _ in range(n+1)]
for _ in range(m):
    x,y = map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)

for i in range(len(graph)):
    graph[i].sort()

#dfs
def dfs(num):
    visited[num] = True
    print(num, end=' ')

    for i in graph[num]:
        if not visited[i]:
            visited[i] = True
            dfs(i)

#bfs
def bfs(num):
    visited[num] = True

    que = deque()
    que.append(num)

    while que:
        x = que.popleft()
        print(x, end=' ')

        for i in graph[x]:
            if not visited[i]:
                visited[i] = True
                que.append(i)
        
visited = [False] * (n+1)
dfs(v)
print()
visited = [False] * (n+1)
bfs(v)