def solution(s):
    answer = ''

    idx = 0

    for i in s:
        if i == ' ':
            answer += ' '
            idx = 0
        
        else:
            if idx % 2 == 0:
                answer += i.upper()

            else:
                answer += i.lower()
            
            idx += 1

    return answer