from collections import deque
import sys
input = sys.stdin.readline

t = int(input())
for _ in range(t):
    d = deque()
    n = int(input())
    a = input().split()

    d.append(a[0])

    for i in range(1,n):
        if a[i] > d[0]:
            d.append(a[i])

        else:
            d.appendleft(a[i])
    
    print(''.join(d))