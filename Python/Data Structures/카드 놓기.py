from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
a.reverse()

d = deque()
result = deque(range(1,n+1))

for i in a:
    tmp = result.popleft()
    if i == 1:
        d.appendleft(tmp)
    elif i == 2:
        d.insert(1,tmp)
    else:
        d.append(tmp)

print(*d)