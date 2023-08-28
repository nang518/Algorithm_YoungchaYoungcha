import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n,m = map(int,input().split())

graph = [[] for _ in range(n+1)]
for _ in range(n-1):
    a,b,d = map(int,input().split())
    graph[a].append((b,d))
    graph[b].append((a,d))

req = []
for _ in range(m):
    a,b = map(int,input().split())
    req.append((a,b))

def dfs(x,y,d):
    visited[x] = True

    if x == y:
        print(d)
        return
    
    for i in graph[x]:
        a,b = i
        if not visited[a]:
            dfs(a, y, b+d)

for i in range(len(req)):
    s,e = req[i]

    visited = [False] * (n+1)
    dfs(s,e,0)