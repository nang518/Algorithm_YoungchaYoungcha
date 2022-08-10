N,K = map(int,input().split())

position = list(input())
cnt = 0

for i in range(N):
    if position[i] == 'P':
        for j in range(i-K, i+K+1):
            if 0 <= j < N:
                if position[j] == 'H':
                    cnt += 1
                    position[j] = 'X'
                    break
print(cnt)