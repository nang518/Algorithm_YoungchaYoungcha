import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())

graph = [[] for _ in range(n+1)]

for _ in range(n-1):
    x,y = map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)

def dfs(num):
    visited[num] = True

    for i in graph[num]:
        if not visited[i]:
            parent[i] = num
            dfs(i)
            

visited = [False] * (n+1)
parent = [0] * (n+1)
dfs(1)

for i in range(2, len(parent)):
    print(parent[i])