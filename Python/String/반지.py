s = input()
n = int(input())

cnt = 0
for _ in range(n):
    x = input()
    x *= 2
    
    if s in x:
        cnt += 1

print(cnt)