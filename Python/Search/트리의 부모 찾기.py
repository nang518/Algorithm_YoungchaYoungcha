import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())

graph = [[] for _ in range(n+1)]

for i in range(n-1):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

def dfs(num):
    visited[num] = True

    for i in graph[num]:
        if not visited[i]:
            parent[i] = num
            dfs(i)

visited = [False] * (n+1)
parent = [0] * (n+1)
dfs(1)

for i in range(2, n+1):
    print(parent[i])