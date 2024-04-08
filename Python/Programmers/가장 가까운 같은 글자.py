def solution(s):
    answer = []
    check = {}

    for i in range(len(s)):
        if s[i] not in check:
            answer.append(-1)
            check[s[i]] = i
        
        else:
            answer.append(i - check[s[i]])
            check[s[i]] = i

    return answer