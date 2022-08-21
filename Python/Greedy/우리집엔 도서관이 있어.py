import sys
input = sys.stdin.readline

N = int(input())
book = []
for _ in range(N):
    book.append(int(input()))

max = book[0]
cnt = 0
for i in range(1,N):
    if book[i] > max:
        if book[i] != max+1:
            cnt+=1
        max = book[i]
    else:
        cnt += 1

print(cnt)