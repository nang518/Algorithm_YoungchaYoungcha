n = int(input())

def factorial(n):
    result = 1

    for i in range(1, n+1):
        result *= i
    
    return result

result = factorial(n)
result = str(result)
result = reversed(result)

cnt = 0

for i in result:
    if i != '0':
        break
    
    cnt += 1

print(cnt)