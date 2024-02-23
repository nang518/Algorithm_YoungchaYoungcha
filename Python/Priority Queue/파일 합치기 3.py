import sys,heapq
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    k = int(input())
    size = list(map(int, input().split()))

    pq = []
    ans = 0

    for i in size:
        heapq.heappush(pq, i)

    while len(pq) > 1:
        x = heapq.heappop(pq)
        y = heapq.heappop(pq)

        ans += x + y
        
        heapq.heappush(pq, x+y)

    print(ans)