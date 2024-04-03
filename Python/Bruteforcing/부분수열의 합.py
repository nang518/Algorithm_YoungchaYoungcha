from itertools import combinations

n,s = map(int, input().split())
a = list(map(int, input().split()))

cnt = 0

for i in range(1, n+1):
    com = combinations(a, i)

    for x in com:
        if sum(x) == s:
            cnt += 1

print(cnt)