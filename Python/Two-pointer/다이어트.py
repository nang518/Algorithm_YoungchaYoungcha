g = int(input())
a,b = 1,1 # a: 현재 몸무게, b: 기억 몸무게

ans = []
while a+b <= g:
    cal = a**2 - b**2
    if cal == g:
        ans.append(a)
        print(a)
        a += 1
    elif cal > g:
        b += 1
    else:
        a += 1
    
if not ans:
    print(-1)