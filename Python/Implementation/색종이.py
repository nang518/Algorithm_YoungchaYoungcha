n = int(input())

pixel = [[0]*100 for _ in range(100)]
cnt = 0

for _ in range(n):
    x,y = map(int, input().split())

    for i in range(x, x+10):
        for j in range(y, y+10):
            pixel[i][j] = 1

for i in pixel:
    cnt += i.count(1)

print(cnt)