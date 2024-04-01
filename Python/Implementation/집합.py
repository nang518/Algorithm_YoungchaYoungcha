import sys
input = sys.stdin.readline

m = int(input())

s = set()

for _ in range(m):
    command = input().split()

    if len(command) == 1:
        if command[0] == 'all':
            s = set([i for i in range(1,21)])
        
        else:
            s = set()
        
        continue

    num = int(command[1])

    if command[0] == 'add':
        s.add(num)
    
    elif command[0] == 'remove':
        s.discard(num)
    
    elif command[0] == 'check':
        
        if num in s:
            print(1)
        
        else:
            print(0)
    
    elif command[0] == 'toggle':

        if num in s:
            s.remove(num)
        
        else:
            s.add(num)