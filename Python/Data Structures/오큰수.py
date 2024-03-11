import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

stk = [0]
NGE = [-1] * n

for i in range(1, n):
    while stk and a[stk[-1]] < a[i]:
        NGE[stk.pop()] = a[i]
    
    stk.append(i)

print(*NGE)