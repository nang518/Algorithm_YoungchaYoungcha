import sys
input = sys.stdin.readline

def cal(direction, distance):
    if direction == 1:
        return distance
    
    elif direction == 2:
        return n + m + (n - distance)
    
    elif direction == 3:
        return n + m + n + (m - distance)

    else:
        return n + distance

n,m = map(int, input().split())
storeNum = int(input())
store = []

for _ in range(storeNum):
    x,y = map(int, input().split())
    store.append((x,y))

dongX, dongY = map(int, input().split())
donggun = cal(dongX, dongY)

total = 0
for i in range(storeNum):
    dist = cal(store[i][0], store[i][1])
    path1 = abs(donggun - dist)
    path2 = 2 * n + 2 * m - path1

    if path1 < path2:
        total += path1
    else:
        total += path2

print(total)