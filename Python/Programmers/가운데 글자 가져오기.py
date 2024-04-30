def solution(s):
    answer = ''

    c = int(len(s) // 2)

    if len(s) % 2 == 0:
        answer += s[c-1 : c+1]
    
    else:
        answer += s[c]

    return answer