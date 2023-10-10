from collections import deque
import sys
input = sys.stdin.readline

n = int(input())

d = deque()

for i in range(n, 0, -1):
    d.appendleft(i)

    for j in range(i):
        d.appendleft(d.pop())
    
print(*d)