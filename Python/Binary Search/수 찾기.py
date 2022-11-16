import sys
n = int(input())
a = list(map(int,input().split()))
a.sort()
m = int(input())
checks = list(map(int,input().split()))

for check in checks:
    result = False
    low,high = 0,n-1

    while low <= high:
        mid = (low+high) // 2
        if a[mid] > check:
            high = mid - 1
        elif a[mid] < check:
            low = mid + 1
        else:
            result = True
            break

    if result:
        print(1, end='\n')
    else:
        print(0, end='\n')