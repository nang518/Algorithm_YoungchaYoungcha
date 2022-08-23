import sys
input = sys.stdin.readline

n,p = map(int,input().split())
li = [[] for _ in range(7)]

cnt = 0
for i in range(n):
    a,b = map(int,input().split())

    if len(li[a]) == 0:
        li[a].append(b)
        cnt += 1
    else:
        if b > li[a][-1]: #새로운 프랫 번호가 더 큰 경우
            li[a].append(b)
            cnt += 1
        elif b < li[a][-1]: #새로운 프랫 번호가 더 작은 경우
            while True:
                if len(li[a]) == 0 or  b > li[a][-1]:
                    li[a].append(b)
                    cnt += 1
                    break
                elif b == li[a][-1]:
                    break
                else:
                     li[a].pop()
                     cnt += 1

print(cnt)