t = int(input())

def gcd(a,b):
    if a==0:
        return b
    else:
        return gcd(b%a, a)

def lcm(a,b):
    return int((a*b)/gcd(a,b))  

for _ in range(t):
    a,b = map(int, input().split())
    print(lcm(a,b), gcd(a,b))