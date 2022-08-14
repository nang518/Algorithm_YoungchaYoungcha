import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N,M = map(int,input().split())

    graph = [[] for _ in range(N+1)]

    for i in range(M):
        a,b = map(int,input().split())
        graph[a].append(b)
        graph[b].append(a)
    

    def dfs(v):
        global cnt
        visited[v] = True

        for i in graph[v]:
            if not visited[i]:
                cnt += 1
                dfs(i)

    visited = [False] * (N+1)

    cnt = 0
    for i in range(N+1):
        if not visited[i]:
            dfs(i)

    print(cnt)