t = int(input())

for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))

    prefixSum = [0] * n
    prefixSum[0] = arr[0]

    for i in range(1, n):
        prefixSum[i] = max(prefixSum[i-1] + arr[i], arr[i])
    
    print(max(prefixSum))