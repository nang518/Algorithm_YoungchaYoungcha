n,m = map(int, input().split())

arr = []

def backTracking(x):
    if len(arr) == m:
        print(' '.join(map(str, arr)))
        return
    
    for i in range(x, n+1):
        arr.append(i)
        backTracking(i)
        arr.pop()

backTracking(1)