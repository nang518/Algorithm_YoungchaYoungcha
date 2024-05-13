n = int(input())
a = list(map(int, input().split()))
v = int(input())

cnt = 0

for i in a:
    if i == v:
        cnt += 1

print(cnt)