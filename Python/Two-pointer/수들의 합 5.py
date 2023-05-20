import sys
input = sys.stdin.readline

n = int(input())

left, right = 0, 1
cnt, total = 0, 1

while left <= right and right <= n:
    if total == n:
        cnt += 1
        right += 1
        total += right

    elif total < n:
        right += 1
        total += right
    
    else:
        total -= left
        left += 1

print(cnt)