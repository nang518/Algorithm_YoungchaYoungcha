import sys
input = sys.stdin.readline

N = int(input())
card = list(map(int,input().split()))
card.sort()
M = int(input())
check = list(map(int,input().split()))

for i in check:
    exist = False
    low,high = 0,N-1
    while low <= high:
        mid = (low+high) // 2
        if card[mid] > i:
            high = mid - 1
        elif card[mid] < i:
            low = mid + 1
        else:
            exist = True
            break
    
    if exist:
        print(1, end=' ')
    else:
        print(0, end=' ')