from itertools import permutations
import sys
input = sys.stdin.readline

n,k = map(int, input().split())
a = [i for i in range(1, n+1)]

if k == 0:
    print(*a)
    exit()

for x in permutations(a, n):
    cnt = 0

    for i in range(n):
        for j in range(i+1, n):
            if x[i] > x[j]:
                cnt += 1
    
    if cnt == k:
        print(*x)
        break