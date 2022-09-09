import sys, heapq
input = sys.stdin.readline

n = int(input())

pq = []
for _ in range(n):
    value = int(input())

    if value == 0:
        if pq:
            print(heapq.heappop(pq))
        else:
            print(0)

    else:
        heapq.heappush(pq, value)