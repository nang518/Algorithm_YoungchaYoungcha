from itertools import permutations

n = int(input())
a = [i for i in range(1,n+1)]

p = permutations(a)

for i in p:
    print(*i, sep = ' ')