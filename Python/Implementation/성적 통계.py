import sys
input = sys.stdin.readline

k = int(input())
for i in range(k):
    n, *arr = map(int, input().split())

    arr.sort(reverse = True)

    gap = 0

    for j in range(n-1):
        tmp = abs(arr[j+1] - arr[j])

        if gap < tmp:
            gap = tmp
    
    print("Class", (i+1))
    print("Max %d, Min %d, Largest gap %d" %(max(arr), min(arr), gap))