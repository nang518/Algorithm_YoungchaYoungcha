str = input()
alp = ['U','C','P','C']

cnt = 0
for i in alp:
    if i in str:
        cnt += 1
        str = str[str.index(i)+1:]
    else:
        print('I hate UCPC')
        break
if cnt == 4:
    print('I love UCPC')