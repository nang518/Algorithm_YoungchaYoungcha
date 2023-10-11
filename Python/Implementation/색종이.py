import sys
input = sys.stdin.readline

n = int(input()) 
pixel = [[0]*100 for _ in range(100)]
cnt = 0 

for i in range(n):
    x,y = map(int, input().split())

    for a in range(x, x+10):
        for b in range(y, y+10):
            pixel[a][b] = 1

for i in pixel:
    cnt += i.count(1)

print(cnt)