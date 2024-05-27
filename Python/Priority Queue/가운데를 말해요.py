import sys,heapq
input = sys.stdin.readline

n = int(input())

leftpq, rightpq = [], []

for i in range(n):
    x = int(input())

    if len(leftpq) == 0 or -leftpq[0] >= x:
        heapq.heappush(leftpq, -x)
    
    else:
        heapq.heappush(rightpq, x)

    if len(leftpq) > len(rightpq) + 1:
        tmp = -heapq.heappop(leftpq)
        heapq.heappush(rightpq, tmp)
    
    elif len(rightpq) > len(leftpq):
        tmp = heapq.heappop(rightpq)
        heapq.heappush(leftpq, -tmp)

    print(-leftpq[0])