n = int(input())

time = []
for _ in range(n):
    s,e = map(int, input().split())
    time.append([s,e])

time.sort()
time.sort(key = lambda x : x[1])

cnt, last = 0,0
for s,e in time:
    if s >= last:
        cnt += 1
        last = e

print(cnt)