import sys,heapq
input = sys.stdin.readline

n,m = map(int, input().split())

orders = [[] for _ in range(200001)]

for i in range(n):
    k, *a = map(int, input().split())

    for o in a:
        heapq.heappush(orders[o], i)

menu = list(map(int, input().split()))
cnt = [0] * n

for sushi in menu:
    if orders[sushi]:
        order = heapq.heappop(orders[sushi])
        cnt[order] += 1

print(*cnt, sep = ' ')