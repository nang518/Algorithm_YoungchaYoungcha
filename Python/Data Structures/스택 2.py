import sys
input = sys.stdin.readline

n = int(input())

stk = []

for _ in range(n):
    command = input().split()

    if command[0] == '1':
        stk.append(command[1])
    
    elif command[0] == '2':
        if stk:
            print(stk.pop())
        else:
            print(-1)
    
    elif command[0] == '3':
        print(len(stk))
    
    elif command[0] == '4':
        if stk:
            print(0)
        
        else:
            print(1)
    
    elif command[0] == '5':
        if stk:
            print(stk[-1])
        
        else:
            print(-1)