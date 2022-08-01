N,K = map(int, input().split())

A = list()
cnt = 0
for i in range(0,N):
    A.append(int(input()))

for i  in range(N-1, -1, -1):
    if K >= A[i]:
        cnt += K // A[i]
        K %= A[i]
    elif K == 0:
        break
print(cnt)