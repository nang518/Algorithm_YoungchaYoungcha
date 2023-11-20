import sys
input = sys.stdin.readline

s = list(input().strip())
m = int(input())

stk = []

for _ in range(m):
    command = list(input().split())

    if command[0] == 'P':
        s.append(command[1])
    
    elif command[0] == 'L':
        if s:
            stk.append(s.pop())

    elif command[0] == 'D':
        if stk:
            s.append(stk.pop())
        
    else:
        if s:
            s.pop()

s.extend(reversed(stk))
print(''.join(s))