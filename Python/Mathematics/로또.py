from itertools import combinations

while True:
    s = input().split()
    
    if s[0] == '0':
        break

    s = s[1:]

    for c in combinations(s, 6):
        print(' '.join(c))

    print()