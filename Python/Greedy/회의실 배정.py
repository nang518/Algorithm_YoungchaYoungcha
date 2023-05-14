import sys
input = sys.stdin.readline

n = int(input())
arr = []

for i in range(n):
    s,e = map(int,input().split())
    arr.append([s,e])

arr.sort()
print(arr)
arr = sorted(arr, key=lambda x:x[1])
print(arr)

print(arr)

cnt, last = 0,0
for start,end in arr:
    if start >= last:
        cnt += 1
        last = end

print(cnt)