from collections import deque

def bfs(v):
    que = deque()
    que.append(v)

    while que:
        q = que.popleft()

        for i in range(n):
            if graph[q][i] == 1 and not visited[i]:
                que.append(i)
                visited[i] = True

n = int(input())

graph = []
for _ in range(n):
    graph.append(list(map(int, input().split())))

visited = [False] * n

for i in range(n):
    bfs(i)

    for j in range(n):
        if visited[j] == True:
            print(1, end = ' ')
        
        else:
            print(0, end = ' ')
    
    print()
    visited = [False] * n