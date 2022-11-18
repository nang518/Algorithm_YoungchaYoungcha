t = int(input())
for _ in range(t):
    n = int(input())
    answer = 0
    for i in range(1,n):
        if i**2 <= n:
            answer += 1
        else: 
            break
    
    print(answer)