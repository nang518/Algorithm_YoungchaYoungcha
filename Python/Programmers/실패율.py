def solution(N, stages):
    answer = []
    fail = {}

    for i in range(1, N+1):
        cnt = 0
        challenge = 0
        for j in stages:
            if i <= j:
                cnt += 1

                if i == j:
                    challenge += 1
        
        if cnt == 0:
            fail[i] = 0
        else:
            fail[i] = challenge / cnt

    sorted_fail = sorted(fail.items(), key = lambda x : x[1], reverse = True)

    for i in sorted_fail:
        answer.append(i[0])

    return answer