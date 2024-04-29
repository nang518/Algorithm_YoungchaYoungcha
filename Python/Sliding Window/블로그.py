import sys
input = sys.stdin.readline

n,x = map(int, input().split())
a = list(map(int, input().split()))

if max(a) == 0:
    print("SAD")
    quit()

total = sum(a[:x])
maxTotal, cnt = total,1

for i in range(x, n):
    total = total + a[i] - a[i-x]

    if total > maxTotal:
        maxTotal = total
        cnt = 1
    
    elif total == maxTotal:
        cnt += 1

print(maxTotal)
print(cnt)