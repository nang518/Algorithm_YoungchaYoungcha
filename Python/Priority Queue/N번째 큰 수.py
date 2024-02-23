import sys,heapq
input = sys.stdin.readline

n = int(input())

pq = []

for _ in range(n):
    numbers = map(int, input().split())

    for num in numbers:
        if len(pq) < n:
            heapq.heappush(pq, num)
            
        else:
            if pq[0] < num:
                heapq.heappop(pq)
                heapq.heappush(pq, num)

print(pq[0])