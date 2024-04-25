t = int(input())

for _ in range(t):
    a,b = map(int, input().split())

    x = a * b
    y = a + b

    if x != y:
        print('yes')
    else:
        print('no')