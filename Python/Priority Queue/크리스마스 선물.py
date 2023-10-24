import sys,heapq
input = sys.stdin.readline

n = int(input())

pq = []
for _ in range(n):
    a = list(map(int, input().split()))

    if a[0] == 0:
        if pq:
            print(-1 * heapq.heappop(pq))
        else:
            print(-1)
    else:
        for i in range(1,len(a)):
            heapq.heappush(pq, -1 * a[i])
