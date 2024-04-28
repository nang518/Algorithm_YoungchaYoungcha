from itertools import permutations

n = int(input())
a = list(map(int, input().split()))
reverse_a = sorted(a)

a = tuple(a)

nPr = permutations(reverse_a, n)
nPr = list(nPr)

for i in range(len(nPr)):
    if nPr[i] == a:
        if i == 0:
            print(-1)
        else:
            print(*nPr[i-1])