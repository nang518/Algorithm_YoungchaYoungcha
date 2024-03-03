import sys,heapq
input = sys.stdin.readline

n = int(input())

pq = []
lecture = []

for _ in range(n):
    s,t = map(int, input().split())
    lecture.append((s,t))

lecture.sort()

for i in range(n):
    start, end = lecture[i]

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