from collections import deque

def bfs(p):
    start = []

    for i in range(5):
        for j in range(5):
            if p[i][j] == 'P':
                start.append((i,j))
    
    for s in start:
        que = deque([s])

        visited = [[False] * 5 for _ in range(5)]
        distance = [[0] * 5 for _ in range(5)]

        visited[s[0]][s[1]] = True

        while que:
            y,x = que.popleft()

            dx = [1,-1,0,0]
            dy = [0,0,1,-1]

            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]

                if 0 <= nx < 5 and 0 <= ny < 5 and not visited[ny][nx]:
                    if p[ny][nx] == 'O':
                        que.append((ny,nx))
                        visited[ny][nx] = True
                        distance[ny][nx] = distance[y][x] +1

                    if p[ny][nx] == 'P' and distance[y][x] <= 1:
                        return 0
        
    return 1

def solution(places):
    answer = []

    for i in places:
        answer.append(bfs(i))

    return answer
