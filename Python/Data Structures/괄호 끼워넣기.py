s = input()

stk = []
cnt = 0

for i in s:
    if i == '(':
        stk.append(i)
    
    else:
        if stk:
            stk.pop()
        else:
            cnt += 1

cnt += len(stk)

print(cnt)