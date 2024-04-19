import sys
input = sys.stdin.readline

n,m = map(int, input().split())

memo = set()
# 리스트 사용하면 시간초과

for _ in range(n):
    x = input().strip()
    memo.add(x)

for _ in range(m):
    s = input().strip()

    if ',' in s:
        s = s.split(',')

    for i in s:
        if i in memo:
            memo.remove(i)
    
    print(len(memo))