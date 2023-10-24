import sys,heapq
input = sys.stdin.readline 

n,m = map(int, input().split())
c = list(map(int, input().split()))
w = list(map(int, input().split()))

pq = []
for i in c:
    heapq.heappush(pq, -1 * i)

for child in w:
    box = -1 * heapq.heappop(pq)

    if box > child:
        heapq.heappush(pq, -1 * (box-child))

    elif box == child:
        continue

    else:
        print(0)
        exit()

print(1)