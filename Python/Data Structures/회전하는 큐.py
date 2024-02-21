from collections import deque
import sys
input = sys.stdin.readline

n,m = map(int, input().split())
p = list(map(int, input().split()))
d = deque([i for i in range(1, n+1)])

cnt = 0
for i in p:
    while True:
        if d[0] == i:
            d.popleft()
            break
        else:
            if d.index(i) < len(d)/2:
                while d[0] != i:
                    d.append(d.popleft())
                    cnt += 1
            else:
                while d[0] != i:
                    d.appendleft(d.pop())
                    cnt += 1

print(cnt)