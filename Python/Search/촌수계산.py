import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())
a,b = map(int,input().split())
m = int(input())

graph = [[] for _ in range(n+1)]
for _ in range(m):
    x,y = map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)      

def dfs(x,y,r):
    visited[x] = True

    for i in graph[y]:
        if not visited[i]:
            if distance[i] == -1:
                distance[i] = r
            dfs(i,y,r+1)

visited = [False] * (n+1)
distance = [-1] * (n+1)
distance[a] = 0

dfs(a,b,1)
print(distance[b])