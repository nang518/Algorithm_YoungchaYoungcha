n = int(input())
arr = []
for i in range(n):
    d,t = map(int,input().split())
    arr.append([d,t])

arr.sort(key=lambda arr:arr[1], reverse = True)

HW_start = arr[0][1] - arr[0][0] +1

for i in range(n):
    d = arr[i][0]
    t = arr[i][1]

    if HW_start >= t:
        HW_start = t-d
    else:
        HW_start = HW_start-d

print(HW_start)