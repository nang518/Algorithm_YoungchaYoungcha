import sys
input = sys.stdin.readline

n = int(input())

stk = []

for _ in range(n):
    command = input().split()

    if command[0] == 'push':
        stk.append(command[1])
    
    elif command[0] == 'pop':
        if stk:
            print(stk.pop())
        
        else:
            print(-1)
    
    elif command[0] == 'size':
        print(len(stk))
    
    elif command[0] == 'empty':
        if stk:
            print(0)
        
        else:
            print(1)
    
    elif command[0] == 'top':
        if stk:
            print(stk[-1])
        
        else:
            print(-1)