def solution(numbers, hand):
    answer = ''

    pad = { '1' : (0,0), '2' : (0,1), '3' : (0,2),
            '4' : (1,0), '5' : (1,1), '6' : (1,2),
            '7' : (2,0), '8' : (2,1), '9' : (2,2),
            '*' : (3,0), '0' : (3,1), '#' : (3,2) }
    
    left = pad['*']
    right = pad['#']

    for n in numbers:
        if n == 1 or n == 4 or n == 7:
            answer += 'L'
            left = pad[str(n)]
        
        elif n == 3 or n == 6 or n == 9:
            answer += 'R'
            right = pad[str(n)]

        else:
            left_distance = abs(left[0] - pad[str(n)][0]) + abs(left[1] - pad[str(n)][1])
            right_distance = abs(right[0] - pad[str(n)][0]) + abs(right[1] - pad[str(n)][1])

            if left_distance < right_distance:
                answer += 'L'
                left = pad[str(n)]
            
            elif left_distance > right_distance:
                answer += 'R'
                right = pad[str(n)]
            
            else:
                if hand == 'right':
                    answer += 'R'
                    right = pad[str(n)]
                else:
                    answer += 'L'
                    left = pad[str(n)]

    return answer