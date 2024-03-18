l = int(input())
arr = list(map(int, input().split()))
n = int(input())

arr.sort()

if n in arr:
    print(0)

else:
    min,max = 0,0

    for x in arr:
        if x < n:
            min = x
        
        if x > n and max == 0:
            max = x
        
    ans = (n - min) * (max - n) - 1
    print(ans)