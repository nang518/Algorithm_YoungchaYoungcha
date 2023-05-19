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
    
    return answer

def is_prime(num):
    for i in range(2, int(num/2)+1):
        if num % i == 0:
            return False
    
    return True