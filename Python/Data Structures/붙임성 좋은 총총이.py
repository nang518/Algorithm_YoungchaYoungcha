n = int(input())

dance = {'ChongChong'}

for _ in range(n):
    a,b = map(str, input().split())

    if a in dance:
        dance.add(b)
    
    elif b in dance:
        dance.add(a)

print(len(dance))