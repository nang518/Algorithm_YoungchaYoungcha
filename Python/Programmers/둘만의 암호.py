def solution(s, skip, index):
    answer = ''

    alpha = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

    for i in skip:
        if i in alpha:
            alpha.remove(i)

    for i in s:
        answer += alpha[(alpha.index(i) + index) % len(alpha)]

    return answer