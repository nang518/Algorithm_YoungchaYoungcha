import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n,m,r = map(int, input().split())

graph = [[] for _ in range(n+1)]
ans = [0] * (n+1)

for _ in range(m):
    x,y = map(int, input().split())

    graph[x].append(y)
    graph[y].append(x)

for i in range(n+1):
    graph[i].sort(reverse = True)

def dfs(v):
    global cnt
    cnt += 1
    visited[v] = True
    ans[v] = cnt

    for i in graph[v]:
        if not visited[i]:
            dfs(i)

visited  = [False] * (n+1)   
cnt = 0
dfs(r)

for i in range(1, n+1):
    print(ans[i])