import sys
input = sys.stdin.readline

arr = []
for _ in range(9):
    arr.append(int(input()))

sum = sum(arr)
arr.sort()

x,y = 0,0
for i in range(8):
    for j in range(i+1,9):
        if sum-(arr[i]+arr[j]) == 100:
            x = arr[i]
            y = arr[j]

arr.remove(x)
arr.remove(y)

arr.sort()
for i in arr:
    print(i)