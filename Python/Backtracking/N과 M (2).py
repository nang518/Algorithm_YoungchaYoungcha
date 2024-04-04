n,m = map(int, input().split())

arr =[]

def backTracking(x):
    if len(arr) == m:
        print(' '.join(map(str, arr)))
        return
    
    for i in range(x, n+1):
        if i not in arr:
            arr.append(i)
            backTracking(i+1)
            arr.pop()

backTracking(1)