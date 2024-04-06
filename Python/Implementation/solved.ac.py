import sys
input = sys.stdin.readline

def round2(x):
    if x - int(x) >= 0.5:
        return int(x) + 1
    else:
        return int(x)

n = int(input())
percent = round2(n * 0.15)

arr =[]

for _ in range(n):
    arr.append(int(input()))

arr.sort()

sum = 0
per = n - (percent * 2)

for i in range(percent, n-percent):
    sum += arr[i]

if per == 0:
    print(0)
else:
    answer = round2(sum/per)
    print(answer)