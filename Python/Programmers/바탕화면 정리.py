# 더 간단한 풀이
def solution(wallpaper):
    answer = []
    x, y = [], []

    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[i])):
            if wallpaper[i][j] == '#':
                x.append(i)
                y.append(j)
    
    answer = [min(x), min(y), max(x)+1, max(y)+1]

    return answer

# def solution(wallpaper):
#     answer = []

#     point = []

#     for i in range(len(wallpaper)):
#         for j in range(len(wallpaper[i])):
#             if wallpaper[i][j] == '#':
#                 point.append([i,j])

#     minX, minY, maxX, maxY = 50, 50, 0, 0

#     for i in range(len(point)):
#         for j in range(len(point)):
#             if point[i][0] < minX:
#                 minX = point[i][0]
            
#             if point[i][0] > maxX:
#                 maxX = point[i][0]
            
#             if point[i][1] < minY:
#                 minY = point[i][1]
            
#             if point[i][1] > maxY:
#                 maxY = point[i][1]

#     maxX += 1
#     maxY += 1

#     answer = [minX, minY, maxX, maxY]

#     return answer