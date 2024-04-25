from itertools import combinations

def solution(number):
    answer = 0

    for i in combinations(number,3):
        sum = 0

        for x in i:
            sum += x
        
        if sum == 0:
            answer += 1

    return answer