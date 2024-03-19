from collections import deque

a,b = map(int, input().split())

que = deque()
que.append((a,1))

while que:
    tmp, cnt = que.popleft()

    if tmp > b:
        continue

    elif tmp == b:
        print(cnt)
        break

    que.append((tmp*2, cnt+1))
    que.append((int(str(tmp) +'1'), cnt+1))

else:
    print(-1)