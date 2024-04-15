n,p = map(int, input().split())
w,l,g = map(int, input().split())

win = []
team = []

for _ in range(p):
    name, result = input().split()

    if result == 'W':
        win.append(name)

for _ in range(n):
    team.append(input())

point = 0

for i in range(n):
    if team[i] in win:
        point += w
    
    else:
        point -= l

        if point < 0:
            point = 0
        
    if point >= g:
        print("I AM NOT IRONMAN!!")
        quit()
        
print("I AM IRONMAN!!")