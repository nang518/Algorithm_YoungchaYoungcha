t = int(input())

for _ in range(t):
    n = int(input())
    a = list(set(map(int, input().split())))
    m = int(input())
    b = list(set(map(int, input().split())))
    k = int(input())
    c = list(set(map(int, input().split())))

    lucky = []

    for i in range(len(a)):
        for j in range(len(b)):
            for l in range(len(c)):
                x = str(a[i] + b[j] + c[l])
                tf = True

                for o in range(len(x)):
                    if not (x[o] == '5' or x[o] == '8'):
                        tf = False
                        break
                
                if tf:
                    lucky.append(x)
    
    lucky = set(lucky)
    print(len(lucky))