import sys
input = sys.stdin.readline

k = int(input())

stk = []
for _ in range(k):
    tmp = int(input())

    if tmp == 0:
        stk.pop()
    else:
        stk.append(tmp)

print(sum(stk))