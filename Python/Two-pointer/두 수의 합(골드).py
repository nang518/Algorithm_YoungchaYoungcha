import sys
input = sys.stdin.readline

t = int(input())
for _ in range(t):
    n,k = map(int,input().split())
    arr = list(map(int,input().split()))
    arr.sort()

    start,end = 0,n-1
    ans = sys.maxsize
    cnt = 0

    while start < end:
        total = arr[start] + arr[end]
        d = abs(k-total)

        if d < ans:
            ans = d
            cnt = 0 # ans이 기준이 되는 것

        if total < k:
            if d == ans:    
                cnt += 1
            start += 1
        elif total > k:
            if d == ans:
                cnt += 1
            end -= 1
        else: # d == k
            cnt += 1
            start += 1
    
    print(cnt)