import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
m = int(input())
arr = list(map(int, input().split()))

a.sort()
for i in arr:
    result = False
    low, high = 0, n-1
    while low <= high:
        mid = (low+high) // 2
        if a[mid] > i:
            high = mid-1
        elif a[mid] < i:
            low = mid+1
        else:
            result = True
            break
    
    if result:
        print(1, end='\n')
    else:
        print(0, end='\n')