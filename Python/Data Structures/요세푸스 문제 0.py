from collections import deque
import sys
input = sys.stdin.readline

n,k = map(int, input().split())

d = deque([i for i in range(1, n+1)])
result = []

while len(d) != 0:
    for _ in range(k-1):
        d.append(d.popleft())
    
    result.append(str(d.popleft()))

print('<' + ', '.join(result) + '>')