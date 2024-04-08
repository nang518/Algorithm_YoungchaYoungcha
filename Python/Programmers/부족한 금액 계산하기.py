def solution(price, money, count):
    answer = money

    total = 0

    for i in range(1, count+1):
        total += price * i
    
    if money < total:
        answer = total - money
    
    else:
        answer = 0
    
    return answer