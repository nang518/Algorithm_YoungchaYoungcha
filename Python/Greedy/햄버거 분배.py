n,k = map(int,input().split())

position = list(input())
cnt = 0

for i in range(n):
    if position[i] == 'P':
        for j in range(i-k, i+k+1):
            if 0<=j<n:
                if position[j]=='H':
                    cnt+=1
                    position[j]='X'
                    break

print(cnt)