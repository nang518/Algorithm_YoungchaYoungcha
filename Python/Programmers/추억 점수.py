def solution(name, yearning, photo):
    answer = []

    dic = {}

    for i in range(len(name)):
        dic[name[i]] = yearning[i]
    
    for i in range(len(photo)):
        cnt = 0 

        for j in photo[i]:
            if j in dic:
                cnt += dic[j]
            else:
                continue

        answer.append(cnt)

    return answer