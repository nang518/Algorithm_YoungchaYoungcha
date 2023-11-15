import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())

graph = []
for _ in range(n):
    graph.append(list(map(int, input().split())))

def dfs(v):
    for i in range(n):
        if graph[v][i] == 1 and not visited[i]:
            visited[i] = True 
            dfs(i)
            
visited = [False] * n

for i in range(n):
    dfs(i)

    for j in range(n):
        if visited[j] == True:
            print(1, end = ' ')
        else:
            print(0, end = ' ')
    print()
    visited = [False] * n