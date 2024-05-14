ml,mr,tl,tr = map(str, input().split())

if ml != mr and tl != tr:
    print('?')

elif ml == mr and tl != tr:
    if ml == 'S' and (tl == 'R' or tr == 'R'):
        print('TK')
    
    elif ml == 'R' and (tl == 'P' or tr == 'P'):
        print('TK')
    
    elif ml == 'P' and (tl == 'S' or tr == 'S'):
        print('TK')
    
    else:
        print('?')

elif ml != mr and tl == tr:
    if tl == 'S' and (ml == 'R' or mr == 'R'):
        print('MS')
    
    elif tl == 'R' and (ml == 'P' or mr == 'P'):
        print('MS')
    
    elif tl == 'P' and (ml == 'S' or mr == 'S'):
        print('MS')
    
    else:
        print('?')
    
else:
    if ml == 'S':
        if tl == 'P':
            print('MS')
        
        elif tl == 'R':
            print('TK')
        
        elif tl == 'S':
            print('?')
    
    elif ml == 'R':
        if tl == 'P':
            print('TK')
        
        elif tl == 'R':
            print('?')
        
        elif tl == 'S':
            print('MS')
    
    elif ml == 'P':
        if tl == 'P':
            print('?')
        
        elif tl == 'R':
            print('MS')
        
        elif tl == 'S':
            print('TK')