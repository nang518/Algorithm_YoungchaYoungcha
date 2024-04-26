import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

NGF = [-1] * n
cnt = [0] * 1000001
stk = [0]

for i in a:
    cnt[i] += 1

for i in range(n):
    while stk and cnt[a[stk[-1]]] < cnt[a[i]]:
        NGF[stk.pop()] = a[i]
    
    stk.append(i)

print(*NGF)