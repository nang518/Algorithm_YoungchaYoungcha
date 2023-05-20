import sys,heapq
input = sys.stdin.readline

n = int(input())

pq = []
for _ in range(n):
    x = int(input())

    if x == 0:
        if pq:
            print(heapq.heappop(pq)[1])
        else:
            print(0)
    else:
        heapq.heappush(pq, (abs(x), x))