s = input().split('-')

total = 0

for i in s[0].split('+'):
    total += int(i)

for i in s[1:]:
    for j in i.split('+'):
        total -= int(j)

print(total)