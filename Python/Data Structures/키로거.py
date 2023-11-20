t = int(input())

for _ in range(t):
    l = input()

    l_stk = []
    r_stk = []
    
    for i in l:
        if i == '<':
            if l_stk:
                r_stk.append(l_stk.pop())
            
        elif i == '>':
            if r_stk:
                l_stk.append(r_stk.pop())
        
        elif i == '-':
            if l_stk:
                l_stk.pop()
        
        else:
            l_stk.append(i)

    l_stk.extend(reversed(r_stk))
    print(''.join(l_stk))