N = int(input())
A = list(map(int,input().split()))
A.sort()
M = int(input())
check = list(map(int,input().split()))

for i in check:
    exist = False
    low,high = 0,N-1
    while low <= high:
        mid = (low+high) // 2
        if A[mid] > i:
            high = mid -1
        elif A[mid] < i:
            low = mid + 1
        else:
            exist = True
            break
    
    if exist:
        print(1, end='\n')
    else:
        print(0, end='\n')