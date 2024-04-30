from collections import deque

n,m = map(int, input().split())

fee = [0]
for _ in range(n):
    fee.append(int(input()))

weight = [0]
for _ in range(m):
    weight.append(int(input()))

wait = deque()
use = [0] * n
total = 0

for _ in range(2*m):
    car = int(input())

    if car > 0:
        if 0 in use:
            use[use.index(0)] = car
            
        else:
            wait.append(car)
    
    else:
        off = use.index(-car)
        use[off] = 0

        total += weight[-car] * fee[off+1]

        if wait:
            use[off] = wait.popleft()

print(total)