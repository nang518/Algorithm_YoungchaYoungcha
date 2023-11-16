from collections import deque
import sys
input = sys.stdin.readline

n = int(input())

que = deque()

for _ in range(n):
    command = input().split()

    if command[0] == "push":
        que.append(command[1])
    
    elif command[0] == "pop":
        if que:
            print(que.popleft())
        else:
            print(-1)
        
    elif command[0] == "size":
        print(len(que))
    
    elif command[0] == "empty":
        if que:
            print(0)
        else:
            print(1)
    
    elif command[0] == "front":
        if que:
            print(que[0])
        else:
            print(-1)

    elif command[0] == "back":
        if que:
            print(que[-1])
        else:
            print(-1)