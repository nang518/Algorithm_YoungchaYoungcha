from itertools import permutations

def solution(numbers):
    answer = 0
    num = list(numbers)

    arr = []
    for i in range(1, len(num)+1):
        arr += list(permutations(num, i))

    intArr = []
    for i in arr:
        intArr.append(int(''.join(i)))
    
    intArr = list(set(intArr))
    
    for i in intArr:
        if i <= 1:
            continue
        elif is_prime(i):
            answer += 1
    
    print(answer)
    return answer

def is_prime(num):
    for i in range(2, int(num/2)+1):
        if num % i == 0:
            return False
    
    return True

solution("011")

# def solution(numbers):
#     answer = 0
#     n = list(numbers)

#     a = []
#     for i in range(1, len(n)+1):
#         a += list(permutations(n, i))   #경우의 수 반환

#     b = []
#     for i in a:
#         b.append(int(''.join(i)))   
#     b = list(set(b))    #경우의 수를 int형으로 담은 배열 b 선언

#     for i in b:
#         if i <= 1:
#             continue    #1 이하면 무시
#         elif is_prime(i):   # 소수면
#             answer += 1     # answer 증가

#     return answer