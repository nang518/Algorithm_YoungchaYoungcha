def solution(keymap, targets):
    answer = []

    for target in targets:
        cnt = 0

        for word in target:
            flag = False
            time = 101

            for key in keymap:
                if word in key:
                    flag = True
                    time = min(key.index(word)+1, time)

            if not flag:
                cnt = - 1
                break

            cnt += time
        
        answer.append(cnt)

    return answer