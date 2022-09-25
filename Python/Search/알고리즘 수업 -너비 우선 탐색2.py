import sys
input = sys.stdin.readline
from collections import deque

n,m,r = map(int,input().split())

graph = [[] for _ in range(n+1)]
for _ in range(m):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

def bfs(num):
    global cnt
    visited[num] = 1

    que = deque()
    que.append(num)

    while que:
        x = que.popleft()
        graph[x].sort(reverse=True)
        
        for i in graph[x]:
            if not visited[i]:
                cnt += 1
                visited[i] = cnt
                que.append(i)

visited = [0] * (n+1)
cnt = 1

bfs(r)
for i in visited[1:]:
    print(i)