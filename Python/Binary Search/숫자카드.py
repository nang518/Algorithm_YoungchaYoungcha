import sys
input = sys.stdin.readline

n = int(input())
cards = list(map(int,input().split()))
cards.sort()
m = int(input())
checks = list(map(int,input().split()))

for check in checks:
    low,high = 0, n-1
    result = False

    while low <= high:
        mid = (low+high) // 2
        if cards[mid] > check:
            high = mid - 1
        elif cards[mid] < check:
            low = mid + 1
        else:
            result = True
            break

    if result:
        print(1,end = ' ')
    else:
        print(0,end = ' ')