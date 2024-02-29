import sys,heapq
input = sys.stdin.readline

n = int(input())

time = []
for _ in range(n):
    s,e = map(int, input().split())

    time.append((s,e))

time.sort()

pq = []
cnt = 1

heapq.heappush(pq, time[0][1])

for i in range(1,n):
    if pq[0] <= time[i][0]:
        heapq.heappop(pq)
    
    else:
        cnt += 1
    
    heapq.heappush(pq, time[i][1])

print(cnt)