import sys
input = sys.stdin.readline

n = int(input())
k = int(input())
sensor = list(map(int, input().split()))
sensor.sort()

if k >= n:
    print(0)
else:
    arr = []
    for i in range(0, n-1):
        arr.append(sensor[i+1]-sensor[i])
        arr.sort()
    
    print(sum(arr[:n-k]))