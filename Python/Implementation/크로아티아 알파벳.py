x = input()

cnt = 0
cro = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for i in cro:
    x = x.replace(i, '0')

print(len(x))