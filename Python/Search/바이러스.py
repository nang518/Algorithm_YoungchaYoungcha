import sys
input = sys.stdin.readline

n = int(input())
k = int(input())

graph = [[] for _ in range(n+1)]

for _ in range(k):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

def dfs(v):
    global cnt
    visited[v] = True
    
    for i in graph[v]:
        if not visited[i]:
            cnt+=1
            dfs(i)

visited = [False] * (n+1)

cnt = 0
dfs(1)
print(cnt)