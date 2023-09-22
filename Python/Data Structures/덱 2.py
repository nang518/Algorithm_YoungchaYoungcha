from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
d = deque()

def sol(tmp, d):
    if tmp[0] == "1":
        d.appendleft(tmp[1])

    elif tmp[0] == "2":
        d.append(tmp[1])

    elif tmp[0] == "3":
        if d:
            print(d[0])
            d.popleft()
        else:
            print(-1)

    elif tmp[0] == "4":
        if d:
            print(d[-1])
            d.pop()
        else:
            print(-1)

    elif tmp[0] == "5":
        print(len(d))

    elif tmp[0] == "6":
        if d:
            print(0)
        else:
            print(1)

    elif tmp[0] == "7":
        if d:
            print(d[0])
        else:
            print(-1)
            
    elif tmp[0] == "8":
        if d:
            print(d[-1])
        else:
            print(-1)

for _ in range(n):
    tmp = input().split()
    sol(tmp,d)