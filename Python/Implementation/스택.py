import sys
input = sys.stdin.readline

n = int(input())

stk = []
for _ in range(n):
    tmp = input().split()

    if tmp[0] == "push":
        stk.append(tmp[1])
    
    elif tmp[0] == "pop":
        if len(stk) != 0:
            print(stk[-1])
            stk.pop()
        else:
            print(-1)
    
    elif tmp[0] == "size":
        print(len(stk))
    
    elif tmp[0] == "empty":
        if len(stk) == 0:
            print(1)
        else:
            print(0)
    
    elif tmp[0] == "top":
        if len(stk) != 0:
            print(stk[-1])
        else:
            print(-1)