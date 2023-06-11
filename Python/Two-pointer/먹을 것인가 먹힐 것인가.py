import sys
input = sys.stdin.readline

t = int(input())

def binarySearch(arr, x):
    start, end = 0, len(arr)-1
    ans = -1

    while start <= end:
        mid = (start+end) // 2
        if arr[mid] < x:
            ans = mid
            start = mid + 1
        else:
            end = mid - 1

    return ans

for _ in range(t):
    n,m = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))

    a.sort()
    b.sort()

    cnt = 0
    for x in a:
        cnt += binarySearch(b,x)+1
    
    print(cnt)