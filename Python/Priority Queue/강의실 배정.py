import sys, heapq
input = sys.stdin.readline

n = int(input())
arr = list()

for _ in range(n):
    start, end = map(int, input().split())
    arr.append((start, end))

arr.sort()

pq = []

for i in range(n):
    start, end = arr[i]

    if not pq:
        heapq.heappush(pq, end)
    else:
        e = heapq.heappop(pq)
        if start >= e:
            heapq.heappush(pq, end)
        else:
            heapq.heappush(pq, end)
            heapq.heappush(pq, e) 

print(len(pq))