import sys
input = sys.stdin.readline 

n,x = map(int, input().split())

menu = []

for _ in range(n):
    a,b = map(int, input().split())
    menu.append((a,b))

menu.sort(key = lambda x : (x[0]-x[1]), reverse = True)

x -= 1000 * n
total = sum(i[1] for i in menu)

for i in range(n):
    if x >= 4000 and menu[i][0] > menu[i][1]:
        total += menu[i][0] - menu[i][1]
        x -= 4000
    
    else:
        break

print(total)