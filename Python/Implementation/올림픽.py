n,k = map(int, input().split())

rank = []

for _ in range(n):
    name, first, second, third = map(int, input().split())
    rank.append((name, first, second, third))

rank.sort(key = lambda x : (x[1], x[2], x[3]), reverse = True)

for i in range(n):
    if rank[i][0] == k:
        idx = i

for i in range(n):
    if rank[idx][1:] == rank[i][1:]:
        print(i + 1)
        break 