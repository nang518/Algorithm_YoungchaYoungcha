import sys
input = sys.stdin.readline

stk = []
ans = []

n = int(input())

cnt = 1
find = True

for _ in range(n):
    tmp = int(input())

    while cnt <= tmp:
        stk.append(cnt)
        cnt += 1
        ans.append('+')
    
    if stk[-1] == tmp:
        stk.pop()
        ans.append('-')
    
    else:
        find = False

if find:
    for i in ans:
        print(i)
else:
    print("NO")