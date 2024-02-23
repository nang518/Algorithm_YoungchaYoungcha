import sys
input = sys.stdin.readline

n = int(input())

stk = []
ans = []

tmp = 1
sequence = True # 수열 만들기가 불가능한 경우를 위함

for _ in range(n):
    num = int(input())

    while tmp <= num:
        stk.append(tmp)
        tmp += 1
        ans.append('+')
    
    if stk[-1] == num:
        stk.pop()
        ans.append('-')

    else:
        sequence = False

if sequence:
    for i in ans:
        print(i)

else:
    print('NO')