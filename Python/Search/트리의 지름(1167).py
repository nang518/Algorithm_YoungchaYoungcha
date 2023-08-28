import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

v = int(input())
graph = [[] for _ in range(v+1)]

for _ in range(v):
    tmp = list(map(int,input().split()))
    for i in range(1, len(tmp)-2, 2):
        graph[tmp[0]].append([tmp[i], tmp[i+1]])

def dfs(x,y):
    for i in graph[x]:
        a,b = i
        if d[a] == -1:
            d[a] = y + b
            dfs(a, y+b)

d = [-1] * (v+1)
d[1] = 0
dfs(1,0)

max_idx = d.index(max(d))
d = [-1] * (v+1)
d[max_idx] = 0
dfs(max_idx, 0)

print(max(d))