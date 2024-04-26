t = int(input())

for _ in range(t):
    s = input().split()
    
    for i in s:
        print(i[::-1], end = ' ')