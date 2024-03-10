a = ['a', 'e', 'i', 'o', 'u']

while True:
    s = input()

    if s == 'end':
        break

    v_cnt = 0
    v_repeat, c_repeat = 0, 0
    flag = 1
    err = 0
    last = ''

    for i in s:
        if i in a:
            if v_repeat == 2 or ((i != 'e' and i != 'o') and last == i):
                flag = 0
                break

            else:
                v_repeat += 1
                c_repeat = 0
                v_cnt += 1
                last = i
            
        else:
            if c_repeat == 2 or last == i:
                flag = 0
                break
            
            else:
                c_repeat += 1
                v_repeat = 0
                last = i

    if v_cnt == 0:
        flag = 0

    if flag:
        print('<' + s + '> is acceptable.')
    
    else:
        print('<' + s + '> is not acceptable.')