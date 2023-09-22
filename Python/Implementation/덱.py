from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
d = deque()

for _ in range(n):
    tmp = input().split()

    if tmp[0] == "push_front":
        d.appendleft(tmp[1])
    elif tmp[0] == "push_back":
        d.append(tmp[1])
    elif tmp[0] == "pop_front":
        if d:
            print(d[0])
            d.popleft()
        else:
            print(-1)
    elif tmp[0] == "pop_back":
        if d:
            print(d[-1])
            d.pop()
        else:
            print(-1)
    elif tmp[0] == "size":
        print(len(d))
    elif tmp[0] == "empty":
        if d:
            print(0)
        else:
            print(1)
    elif tmp[0] == "front":
        if d:
            print(d[0])
        else:
            print(-1)
    elif tmp[0] == "back":
        if d:
            print(d[-1])
        else:
            print(-1)