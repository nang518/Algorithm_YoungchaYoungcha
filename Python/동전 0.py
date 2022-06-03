N,K = map(int, input().split())

money = list()
cnt = 0

for i in range(0,N):
    money.append(int(input()))

for i in range(N-1,-1,-1):
    if K >= money[i]:
        cnt += K // money[i]
        K %= money[i]
    elif K == 0:
        break
print(cnt)