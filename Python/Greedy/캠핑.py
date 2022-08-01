i = 1
while True:
    l,p,v = map(int,input().split())
    ans = 0
    if l+p+v == 0:
        break
    
    ans = ((v//p) * l) + min((v%p),l)

    print("Case %d: %d" %(i,ans))
    i += 1