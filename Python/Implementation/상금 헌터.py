t = int(input())

for _ in range(t):
    a,b = map(int, input().split())

    result = 0

    if a == 0:
        pass
    elif a <= 1:
        result += 500
    elif a <= 3:
        result += 300
    elif a <= 6:
        result += 200
    elif a <= 10:
        result += 50
    elif a <= 15:
        result += 30
    elif a <= 21:
        result += 10
    

    if b == 0:
        pass
    elif b <= 1:
        result += 512
    elif b <= 3:
        result += 256
    elif b <= 7:
        result += 128
    elif b <= 15:
        result += 64
    elif b <= 31:
        result += 32

    print(result * 10000)