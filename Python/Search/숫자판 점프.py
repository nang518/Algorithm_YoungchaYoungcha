import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

result = []
graph = [list(map(str,input().split())) for _ in range(5)]

dx = [1,-1,0,0]
dy = [0,0,1,-1]

def dfs(x,y,num):
    num += graph[x][y]

    if len(num) == 6:
        if num not in result:
            result.append(num)
        return

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0<=nx<5 and 0<=ny<5:
            dfs(nx,ny,num)

for i in range(5):
    for j in range(5):
        dfs(i,j,"")

print(len(result))