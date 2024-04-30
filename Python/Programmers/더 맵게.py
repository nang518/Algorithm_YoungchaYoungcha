import heapq

def solution(scoville , k):
    answer = 0

    pq = []
    for i in scoville:
        heapq.heappush(pq, i)
    
    while pq[0] < k:
        x = heapq.heappop(pq) + (heapq.heappop(pq) * 2)
        heapq.heappush(pq, x)
        answer += 1

        if len(pq) == 1 and pq[0] < k:
            return -1    

    return answer