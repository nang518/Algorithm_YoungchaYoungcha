idx = 0

while True:
    s = input()

    stk = []
    cnt = 0

    if '-' in s:
        break

    for i in s:
        if i == '{':
            stk.append(i)
        
        else:
            if stk:
                stk.pop()
    
            else:
                stk.append(i)
                cnt += 1
    
    idx += 1
    cnt += len(stk) // 2
    
    print(f'{idx}. {cnt}')