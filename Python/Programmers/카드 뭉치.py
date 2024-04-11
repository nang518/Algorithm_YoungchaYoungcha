from collections import deque

def solution(cards1, cards2, goal):
    answer = []

    cards1 = deque(cards1)
    cards2 = deque(cards2)

    for word in goal:
        if cards1 and word == cards1[0]:
            answer.append(cards1[0])
            cards1.popleft()

        elif cards2 and word == cards2[0]:
            answer.append(word)
            cards2.popleft()
        
        else:
            return "No"
    
    return "Yes"