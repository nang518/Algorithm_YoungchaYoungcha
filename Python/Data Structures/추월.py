from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
dq = deque()

for _ in range(n):
    s = input().strip()
    dq.append(s)

cnt = 0

for i in range(n):
    s = input().strip()

    if s != dq[0]:
        cnt += 1
        dq.remove(s)
    
    else:
        dq.popleft()

print(cnt)