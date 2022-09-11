import sys,heapq
input = sys.stdin.readline

n = int(input())

pq = []
for _ in range(n):
    temp = list(map(int,input().split()))

    if temp[0] == 0:
        if pq:
            print(-1 * heapq.heappop(pq))
        else:
            print(-1)
    
    else:
        for i in range(1, temp[0]+1):
            heapq.heappush(pq, -1 * temp[i])