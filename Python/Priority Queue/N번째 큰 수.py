import sys,heapq
input = sys.stdin.readline

n = int(input())

pq = []

for _ in range(n):
    numbers = map(int, input().split())

    for x in numbers:
        if len(pq) < n:
            heapq.heappush(pq, x)
        
        else:
            if pq[0] < x:
                heapq.heappop(pq)
                heapq.heappush(pq, x)
    
print(pq[0])