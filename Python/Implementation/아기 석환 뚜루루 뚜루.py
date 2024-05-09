a = ['baby', 'sukhwan', 'tururu', 'turu', 'very', 'cute', 'tururu', 'turu', 'in', 'bed', 'tururu', 'turu', 'baby', 'sukhwan']

n = int(input()) -1 
k = n % 14

if 'turu' not in a[k]:
    print(a[k])
    quit()

repeat = a[k] + 'ru' * (n // 14)
ru_cnt = repeat.count('ru')

if ru_cnt >= 5:
    print('tu+ru*',ru_cnt, sep = '')
else:
    print(repeat)