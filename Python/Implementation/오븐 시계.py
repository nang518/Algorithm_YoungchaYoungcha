a,b = map(int, input().split())
c = int(input())

tmp = b + c

if tmp >= 60:
    a += int(tmp / 60)

    if a >= 24:
        a -= 24
    
    b = tmp - (60 * int(tmp / 60))


else:
    b = tmp

print(a, b)