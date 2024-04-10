def solution(a, b, n):
    answer = 0
    
    while n >= a:
        x = n // a
        answer += b * x
        n = n - (a*x) + (b*x)

    return answer