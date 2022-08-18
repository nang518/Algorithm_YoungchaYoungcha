import sys
input = sys.stdin.readline

n,x = map(int,input().split()) 
menu = []
for _ in range(n):
    a,b = map(int,input().split())
    menu.append([a,b])
    
menu.sort(key=lambda b:(b[0]-b[1]), reverse = True)

x -= n*1000
answer = sum([i[1] for i in menu])

for b in menu:
    if x >= 4000 and b[0]>b[1]:
        answer += b[0]-b[1]
        x -= 4000
    else:
        break

print(answer)