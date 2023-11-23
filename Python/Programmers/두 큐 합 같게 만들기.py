from collections import deque

def solution(queue1, queue2):
    answer = 0

    queue1 = deque(queue1)
    queue2 = deque(queue2)

    tot1 = sum(queue1)
    tot2 = sum(queue2)

    for i in range(30000):
        if tot1 > tot2:
            target = queue1.popleft()    
            queue2.append(target)

            tot1 -= target
            tot2 += target
        
        elif tot1 < tot2:
            target = queue2.popleft()
            queue1.append(target)

            tot2 -= target
            tot1 += target
        
        else:
            return i

    return -1