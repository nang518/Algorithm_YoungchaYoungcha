import sys
input = sys.stdin.readline

n = input().strip()

arr = [0] * 10

for i in range(len(n)):
    x = int(n[i])

    if x == 9 or x == 6:
        if arr[6] <= arr[9]:
            arr[6] += 1

        else:
            arr[9] += 1
    
    else:
        arr[x] += 1

print(max(arr))