import sys
input = sys.stdin.readline

N = int(input())
K = int(input())
sensor = list(map(int,input().split()))
sensor.sort()

if K >= N:
    print(0)
else:
    arr = []
    for i in range(0,N-1):
        arr.append(sensor[i+1]-sensor[i])
    arr.sort()

    print(sum(arr[:N-K]))