N = int(input())
arr = list(map(int,input().split()))

light = [0] * N
cnt = 0
for i in range(N):
    if arr[i] != light[i]:
        cnt += 1
        light[i] = not light[i]

        if i+1 < N:
            light[i+1] = not light[i+1]
        if i+2 < N:
            light[i+2] = not light[i+2]

print(cnt)