while True:
    s = input()

    stk = []

    if s == '.':
        break
    
    for i in s:
        if i == '[' or i == '(':
            stk.append(i)
        
        elif i == ']':
            if len(stk) != 0 and stk[-1] == '[':
                stk.pop()
            
            else:
                stk.append(i)
                
        elif i == ')':
            if len(stk) != 0 and stk[-1] == '(':
                stk.pop()
            
            else:
                stk.append(i)

    if len(stk) == 0:
        print('yes')

    else:
        print('no')