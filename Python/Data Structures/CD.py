import sys
input = sys.stdin.readline

while True:
    n,m = map(int, input().split())

    if n == 0 and m == 0:
        break

    cd = {}

    for _ in range(n):
        x = int(input())

        if x not in cd:
            cd[x] = 1
        
        else:
            cd[x] += 1
    
    for _ in range(m):
        x = int(input())

        if x not in cd:
            cd[x] = 1
        
        else:
            cd[x] += 1
    
    cnt = 0

    for k,v in cd.items():
        if v % 2 == 0:
            cnt += 1
    
    print(cnt)