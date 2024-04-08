def solution(food):
    answer = ''
    first = ''
    second = ''

    for i in range(1, len(food)):
        cnt = food[i] // 2

        for j in range(cnt):
            first += str(i)
            second += str(i)
    
    answer = first + '0' + second[::-1]

    return answer