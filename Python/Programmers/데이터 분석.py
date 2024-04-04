def solution(data, ext, val_ext, sort_by):
    answer = []
    
    if ext == 'date':
        for i in range(len(data)):
            if data[i][1] < val_ext:
                answer.append(data[i])
    
    if ext == 'code':
        for i in range(len(data)):
            if data[i][0] < val_ext:
                answer.append(data[i])
        
    if ext == 'maximum':
        for i in range(len(data)):
            if data[i][2] < val_ext:
                answer.append(data[i])
    
    if ext == 'remain':
        for i in range(len(data)):
            if data[i][3] < val_ext:
                answer.append(data[i])
    
    if sort_by == 'code':
        answer.sort(key = lambda x : x[0])

    if sort_by == 'date':
        answer.sort(key = lambda x : x[1])

    if sort_by == 'maximum':
        answer.sort(key = lambda x : x[2])
    
    if sort_by == 'remain':
        answer.sort(key = lambda x : x[3])
    

    return answer