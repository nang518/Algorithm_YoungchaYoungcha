n,m = map(int, input().split())

s = set()
cnt = 0

for _ in range(n):
    s.add(input())

for _ in range(m):
    x = input()

    if x in s:
        cnt += 1

print(cnt)