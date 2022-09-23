import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
k = int(input())

graph = [[] for _ in range(n+1)]
for _ in range(k):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

def bfs(num):
    global cnt
    visited[num] = True

    que = deque()
    que.append(num)

    while que:
        x = que.popleft()

        for i in graph[x]:
            if not visited[i]:
                visited[i] = True
                cnt += 1
                que.append(i)

visited = [False] * (n+1)

cnt = 0
bfs(1)
print(cnt)