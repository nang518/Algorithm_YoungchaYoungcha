import sys
input = sys.stdin.readline

k = int(input())

stk = []
for _ in range(k):
    x = int(input())

    if x == 0:
        stk.pop()
    else:
        stk.append(x)

print(sum(stk))