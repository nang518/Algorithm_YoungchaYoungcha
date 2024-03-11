from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
m = int(input())
c = list(map(int, input().split()))

d = deque()

for i in range(n):
    if a[i] == 0:
        d.append(b[i])
    
for i in range(m):
    d.appendleft(c[i])

for _ in range(m):
    print(d.pop(), end = ' ')