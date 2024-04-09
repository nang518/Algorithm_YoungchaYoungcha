def solution(babbling):
    answer = 0
    can = ["aya", "ye", "woo", "ma"]

    for b in babbling:
        for c in can:
            if c * 2 not in b:
                b = b.replace(c, ' ')
    
        if b.isspace():
            answer += 1

    return answer