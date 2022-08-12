#N(세로길이)xM(가로길이) 크기의 얼음 틀이 있습니다. 구멍이 뚫려 있는 부분은 0, 칸막이가 있는 부분은 1로 표시됩니다.
#구멍이 뚫려 있는 부분끼리 상,하,좌,우로 붙어있는 경우는 연결되어 있는 것으로 간주합니다.
#얼음 틀의 모양이 주어졌을 때, 생성되는 총 아이스크림의 개수를 구하세요

#DFS
def dfs(x,y):
    if x <= -1 or x >= N or y <= -1 or y >= M:
        return False
    if graph[x][y] == 0:
        graph[x][y] = 1
        dfs(x-1,y)
        dfs(x+1,y)
        dfs(x,y-1)
        dfs(x,y+1)
        return True
    return False

N,M = map(int,input().split())
graph = []
for i in range(N):
    graph.append(list(int,input().split()))

answer = 0
for i in range(N):
    for j in range(M):
        if dfs(i,j) == True:
            answer += 1
print(answer)