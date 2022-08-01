N = int(input())
T = list(map(int,input().split()))
T.sort(reverse=True)

days = T[0]
if N == 1:
    print(N+2)
else:
    for i in range(1,N):
        if days < T[i] + i:
            days = T[i] + i
        result = days + 2
    print(result)