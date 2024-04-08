import heapq

def solution(k, score):
    answer = []
    pq = []

    for i in range(len(score)):
        heapq.heappush(pq, score[i])

        if len(pq) > k:
            heapq.heappop(pq)
        
        answer.append(pq[0])

    return answer