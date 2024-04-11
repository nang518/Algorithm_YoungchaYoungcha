def solution(k, m, score):
    answer = 0

    score.sort(reverse = True)
    
    for i in range(0, len(score), m):
        group = []

        if i > len(score) - m:
            break
        
        for j in range(i, i+m):
            group.append(score[j])
    

        answer += min(group) * m

    return answer