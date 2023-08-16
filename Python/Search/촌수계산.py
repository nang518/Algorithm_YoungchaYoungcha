import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input()) # 전체 사람의 수
a,b = map(int,input().split()) # 촌수를 계산해야 하는 두 사람
m = int(input()) # 부모 자식들 간의 관계 수

graph = [[] for _ in range(n+1)]
for _ in range(m):
    x,y = map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)

def dfs(x,y,d):
    visited[x] = True
    
    for i in graph[x]:
        if not visited[i]:
            if distance[i] == -1:
                distance[i] = d
            dfs(i,y,d+1)
                

visited = [False] * (n+1)
distance = [-1] * (n+1)
distance[a] = 0

dfs(a,b,1)
print(distance[b])