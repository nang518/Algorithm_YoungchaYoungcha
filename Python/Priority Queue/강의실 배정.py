import sys, heapq
input = sys.stdin.readline

n = int(input())

lecture = []
pq = []

for _ in range(n):
    s,t = map(int, input().split())
    lecture.append((s,t))

lecture.sort()

for i in range(n):
    s,e = lecture[i]

    if not pq:
        heapq.heappush(pq, e)
    
    else:
        end = heapq.heappop(pq)

        if s >= end:
            heapq.heappush(pq, e)
        
        else:
            heapq.heappush(pq, end)
            heapq.heappush(pq, e)

print(len(pq))