import sys
input = sys.stdin.readline
n,k = map(int,input().split())
arr = list(map(int,input().split()))

answer = 0
left = 1
right = (10 ** 5 * 20) + 1

while left <= right:
    mid = (left + right) // 2
    score = 0
    group_cnt = 0
    for s in arr:
        score += s
        if score >= mid:
            group_cnt += 1
            score = 0
    
    if group_cnt < k:
        right = mid - 1
    else:
        answer = mid
        left = mid + 1

print(answer)