def solution(survey, choices):
    answer = ''

    types = {"R" : 0, "T" : 0, "F" : 0, "C" : 0, "M" : 0, "J" : 0, "A" : 0, "N" : 0 }

    for i in range(len(choices)):
        if choices[i] < 4:
            types[survey[i][0]] += (choices[i] * 3) % 4

        elif choices[i] > 4:
            types[survey[i][1]] += choices[i] % 4
        
    type_keys = list(types.keys())

    for i in range(0, len(type_keys), 2):
        if types[type_keys[i]] > types[type_keys[i+1]]:
            answer += type_keys[i]

        elif types[type_keys[i]] < types[type_keys[i+1]]:
            answer += type_keys[i+1]
        
        else:
            answer += min(type_keys[i], type_keys[i+1])

    return answer