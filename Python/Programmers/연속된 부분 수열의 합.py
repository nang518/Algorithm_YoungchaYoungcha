def solution(sequence, k):
    answer = []
    sum = 0
    l,r = 0, -1

    while True:
        if sum < k:
            r += 1
            
            if r >= len(sequence):
                break
        
            sum += sequence[r]
        
        else:
            sum -= sequence[l]
            
            if l >= len(sequence):
                break
                
            l += 1
        
        if sum == k:
            answer.append([l,r])
    
    answer.sort(key = lambda x : (x[1]-x[0], x[0]))

    return answer[0]

# 시간초과
# def solution(sequence, k):
#     answer = []

#     for i in range(len(sequence)):
#         prefixSum = sequence[i]

#         if prefixSum == k:
#             answer.append([i,i])
    
#         for j in range(i+1, len(sequence)):
#             prefixSum += sequence[j]

#             if prefixSum == k:
#                 answer.append([i,j])
            
#             elif prefixSum > k:
#                 break
    
#     answer.sort(key = lambda x : (x[1]-x[0]))

#     return answer[0]