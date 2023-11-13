import sys, heapq
input = sys.stdin.readline

n = int(input())

pq = []
cnt = 0

dasom = int(input())
for _ in range(n-1):
    tmp = int(input())
    # 내림차순으로 저장하기 위해 음수로 저장
    heapq.heappush(pq, -tmp)

while True:
    if pq:
        tmp = -1 * heapq.heappop(pq)

        if tmp >= dasom:
            dasom += 1
            tmp -= 1
            cnt += 1
            heapq.heappush(pq, -1 * tmp)
    else:
        break

print(cnt)