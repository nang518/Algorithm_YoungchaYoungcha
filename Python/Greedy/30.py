n = list(input())

n.sort(reverse = True)

total = 0 
for i in n:
    total += int(i)

if total % 3 != 0 or "0" not in n:
    print(-1)

else:
    print(''.join(n))