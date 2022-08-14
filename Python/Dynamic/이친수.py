import sys
input = sys.stdin.readline

N = int(input())

arr = [0,1,1]

for i in range(3,91):
    sum = arr[i-1] + arr[i-2]
    arr.append(sum)

print(arr[N])