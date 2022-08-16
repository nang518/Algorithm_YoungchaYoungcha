import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

def dfs(q,p,r):
    visited[q] = True

    for i in graph[q]:
        if not visited[i]:
            if distance[i] == -1:
                distance[i] = r
            dfs(i,p,r+1)

n = int(input())
a,b = map(int,input().split())
m = int(input())

graph = [[] for _ in range(n+1)]
for _ in range(m):
    x,y = map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)

visited = [False] * (n+1)
distance = [-1] * (n+1)
distance[a] = 0

dfs(a,b,1)
print(distance[b])