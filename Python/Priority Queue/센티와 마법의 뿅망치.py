import sys,heapq
input = sys.stdin.readline

n,h,t = map(int, input().split())

pq = []
cnt = 0

for _ in range(n):
    tmp = int(input())
    heapq.heappush(pq, -1 * tmp)

for _ in range(t):
    giant = -1 * heapq.heappop(pq)

    if giant == 1 or giant < h:
        heapq.heappush(pq, -1 * giant)
        break

    else:
        heapq.heappush(pq, -1 * (giant // 2))
        cnt += 1

last = -1 * heapq.heappop(pq)

if last >= h:
    print("NO")
    print(last)

else:
    print("YES")
    print(cnt)