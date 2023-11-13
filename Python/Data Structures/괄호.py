import sys
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    s = input()
    
    cnt = 0

    for i in s:
        if i == '(':
            cnt += 1
        elif i == ')':
            cnt -= 1

        if cnt < 0:
            break
    
    if cnt == 0:
        print("YES")
    else:
        print("NO")