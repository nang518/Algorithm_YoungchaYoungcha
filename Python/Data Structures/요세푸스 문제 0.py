from collections import deque
import sys
input = sys.stdin.readline

n,k = map(int, input().split())

dq = deque([i for i in range(1,n+1)])

result = []

while len(dq) != 0:
    for _ in range(k-1):
        dq.append(dq.popleft())
    
    result.append(str(dq.popleft()))

print('<' + ', '.join(result) + '>')