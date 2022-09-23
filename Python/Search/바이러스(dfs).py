import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())
k = int(input())

graph = [[] for _ in range(n+1)]

for _ in range(k):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

def dfs(num):
    global cnt
    visited[num] = True

    for i in graph[num]:
        if not visited[i]:
            cnt += 1
            dfs(i)

visited = [False] * (n+1)

cnt = 0
dfs(1)
print(cnt)