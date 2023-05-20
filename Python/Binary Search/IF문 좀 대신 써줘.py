import sys
input = sys.stdin.readline

n,m = map(int, input().split())

nameArr, powerArr = [], []
for _ in range(n):
    name, power = input().split()
    power = int(power)

    if powerArr and powerArr[-1] == power:
        continue
    powerArr.append(power)
    nameArr.append(name)

def binary_search(n):
    low, high = 0, len(powerArr)-1
    while low <= high:
        mid = (low+high) // 2
        if powerArr[mid] < n:
            low = mid + 1
        else:
            high = mid - 1
    
    print(nameArr[high+1])

for _ in range(m):
    power = int(input())
    binary_search(power)