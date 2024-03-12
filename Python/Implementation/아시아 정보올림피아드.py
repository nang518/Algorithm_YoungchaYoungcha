n = int(input())

point = []
cnt = 0

for _ in range(n):
    x,y,z = map(int, input().split())
    point.append((x,y,z))

point.sort(key = lambda x : x[2], reverse = True)

print(point[0][0], point[0][1])
print(point[1][0], point[1][1])

if point[0][0] == point[1][0]:
    cnt = 2

for i in range(2, n):    
    if cnt == 2:
        if point[1][0] != point[i][0]:
            print(point[i][0], point[i][1])
            break
    
    else:
        print(point[2][0], point[2][1])
        break