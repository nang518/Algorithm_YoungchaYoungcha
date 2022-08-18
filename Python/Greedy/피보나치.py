fibonacci = [0,1]
for i in range(2,50):
    fibonacci.append(fibonacci[i-1]+fibonacci[i-2])

T = int(input())

for i in range(T):
    n = int(input())

    arr = []

    while(n):
        for j in range(50):
            if fibonacci[j] <= n:
                tmp = fibonacci[j]
            
        n = n-tmp
        arr.append(tmp)
        arr.sort()
        
    for i in arr:
        print(i, end=' ')