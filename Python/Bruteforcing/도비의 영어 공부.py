while True:
    n = input()
    if n == '#':
        break
    alpha = n[0]
    data = n[2::]
    result = data.count(alpha) + data.count(alpha.upper()) #소문자 개수와 대문자 개수 합 할당
    print(alpha, result)