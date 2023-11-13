import sys
input = sys.stdin.readline

n = int(input())

a = list(map(int, input().split()))
a.sort()

m = int(input())
search = list(map(int, input().split()))

for check in search:
    low, high = 0, n-1

    while low <= high:
        exist = False
        mid = (low + high) // 2

        if a[mid] > check:
            high = mid - 1
        elif a[mid] < check:
            low = mid + 1
        else:
            exist = True
            break
    
    if exist:
        print(1, end = '\n')
    else:
        print(0, end = '\n')