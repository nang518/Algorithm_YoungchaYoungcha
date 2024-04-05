n,m = map(int, input().split())

arr = []

def backTracking():
    if len(arr) == m:
        print(' '.join(map(str, arr)))
        return
    
    for i in range(1, n+1):
        arr.append(i)
        backTracking()
        arr.pop()

backTracking()