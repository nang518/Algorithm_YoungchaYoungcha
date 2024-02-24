from re import L
import sys,heapq
input = sys.stdin.readline

n,m = map(int, input().split())
t = list(map(int, input().split()))

t.sort(reverse = True)

pq = []

for time in t:
    if len(pq) < m:
        heapq.heappush(pq, time)
    
    else:
        ing = heapq.heappop(pq)
        heapq.heappush(pq, ing + time)
    

print(max(pq))