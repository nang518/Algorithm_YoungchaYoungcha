T = int(input())
for _ in range(T):
    N = int(input())
    arr = list(map(int,input().split()))

    answer = 0
    max = 0
    
    for i in range(len(arr)-1, -1, -1):
        if arr[i] > max:
            max = arr[i]
        else:
            answer += max - arr[i]
        
    print(answer)