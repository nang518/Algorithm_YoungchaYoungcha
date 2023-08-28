import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())
graph = [[] for _ in range(n+1)]
for _ in range(n-1):
    x,y,z = map(int,input().split())
    graph[x].append([y,z])
    graph[y].append([x,z])

def dfs(x,y):
    for i in graph[x]:
        a,b = i
        if d[a] == -1:
            d[a] = y + b
            dfs(a, y+b)

d = [-1] * (n+1)
d[1] = 0
dfs(1,0)

max_idx = d.index(max(d))
d = [-1] * (n+1)
d[max_idx] = 0
dfs(max_idx,0)

print(max(d))