import  sys
input = sys.stdin.readline

n = int(input())

arr = []
for _ in range(n):
   arr.append(int(input()))

arr.sort()

hap = 0
for i in range(n):
    if arr[i] != i+1:
        hap += abs(arr[i] - (i+1))
    
print(hap)