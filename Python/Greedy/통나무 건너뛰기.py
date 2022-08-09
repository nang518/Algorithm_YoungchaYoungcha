T = int(input())
for _ in range(T):
    N = int(input())
    L = list(map(int,input().split()))
    L.sort()

    result = 0
    for i in range(2,N):
        result = max(result, abs(L[i]-L[i-2]))
    print(result)