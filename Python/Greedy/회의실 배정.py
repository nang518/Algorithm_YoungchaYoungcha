N = int(input())
I = []
for i in range(N):
    start,end = map(int,input().split())
    I.append([start, end])

I = sorted(I, key=lambda x:x[0])
I = sorted(I, key=lambda x:x[1])

cnt = 0
last = 0
for start, end in I:
    if start >= last:
        cnt += 1
        last = end
print(cnt)