def solution(lottos, win_nums):
    answer = []
    best, worst = 0, 0

    for i in win_nums:
        if i in lottos:
            worst += 1
    
    for i in lottos:
        if i == 0:
            best += 1
    
    best += worst
    
    answer.append(rank(best))
    answer.append(rank(worst))
    
    return answer

def rank(cnt):
    if cnt == 6:
        return 1
    
    elif cnt == 5:
        return 2
    
    elif cnt == 4:
        return 3
    
    elif cnt == 3:
        return 4
    
    elif cnt == 2:
        return 5
    
    else:
        return 6