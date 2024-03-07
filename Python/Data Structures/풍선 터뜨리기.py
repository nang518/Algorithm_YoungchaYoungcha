from collections import deque

n = int(input())
d = deque(enumerate(map(int, input().split())))

ans = []

while d:
    idx, num = d.popleft()
    ans.append(idx+1)

    if num > 0:
        d.rotate(-(num-1))
    
    else:
        d.rotate(-num)

print(' '.join(map(str, ans)))