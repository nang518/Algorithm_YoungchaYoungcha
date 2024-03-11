import sys
input = sys.stdin.readline

n = int(input())
line = list(map(int, input().split()))
wait = []
num = 1

while line:
    if line[0] == num:
        line.pop(0)
        num += 1
    
    else:
        wait.append(line.pop(0))
    
    while wait:
        if wait[-1] == num:
            wait.pop()
            num += 1
        
        else:
            break

if wait:
    print("Sad")

else:
    print("Nice")