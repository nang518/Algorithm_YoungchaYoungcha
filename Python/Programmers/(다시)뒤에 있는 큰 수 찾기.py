def solution(numbers):
    answer = [-1] * len(numbers)
    stk = []

    for i in range(len(numbers)):
        while stk and numbers[stk[-1]] < numbers[i]:
            answer[stk.pop()] = numbers[i]
        
        stk.append(i)
    
    return answer
    
# 시간초과 (결국 완전탐색이랑 같은 시간복잡도)
# def solution(numbers):
#     answer = []

#     for i in range(len(numbers)):
#         r = i + 1

#         while True:
#             if r == len(numbers):
#                 answer.append(-1)
#                 break

#             if numbers[r] > numbers[i]:
#                 answer.append(numbers[r])
#                 break
            
#             else:
#                 r += 1
            
#     return answer

#numbers = [2,3,3,5]
numbers = [9, 1, 5, 3, 6, 2]
#numbers = [2,2,2,2]

print(solution(numbers))