import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n,m = map(int,input().split()) # n: 정점, m: 간선

graph = [[] for  _ in range(n+1)]
for _ in range(m):
    u,v = map(int,input().split())
    graph[u].append(v)
    graph[v].append(u)

def dfs(x,y):
    visited[x] = True
    for i in graph[x]:
        if not visited[i]:
            dfs(i,y+1)

visited = [False] * (n+1)
cnt = 0
for i in range(1,n+1):
    if not visited[i]:
        if not graph[i]: # i노드에 연결된 그래프가 없는 경우
            cnt += 1
            visited[i] = True
        else:
            dfs(i,0)
            cnt += 1

print(cnt)