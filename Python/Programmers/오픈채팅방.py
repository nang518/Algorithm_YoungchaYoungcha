def solution(record):
    answer = []
    user = {}

    for info in record:
        info_split = info.split()

        if len(info_split) == 3:
            user[info_split[1]] = info_split[2]
    
    for info in record:
        info_split = info.split()

        if info_split[0] == 'Enter':
            answer.append("%s님이 들어왔습니다." %user[info_split[1]])
        
        elif info_split[0] == 'Leave':
            answer.append("%s님이 나갔습니다." %user[info_split[1]])
    
    return answer