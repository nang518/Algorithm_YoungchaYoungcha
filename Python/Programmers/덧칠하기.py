def solution(n, m, section):
    answer = 0

    tiles = [0] * n

    for i in section:
        tiles[i-1] = 1
    
    for i in range(n):
        if tiles[i] == 1:
            for j in range(1,m):
                if i+j < n:
                    tiles[i+j] = 0
            
            answer += 1

    return answer