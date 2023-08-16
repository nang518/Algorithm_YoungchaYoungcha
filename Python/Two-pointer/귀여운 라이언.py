n,k = map(int,input().split())
arr = list(map(int,input().split()))

lion = []
for i in range(len(arr)):
    if arr[i] == 1:
        lion.append(i)

if len(lion)<k:
    print(-1)
    exit(0)

left,right = 0,k-1
ans = 1000000
while True:
    x = lion[right]-lion[left]+1
    ans = min(ans,x)

    if right == len(lion)-1:
        break
    left += 1
    right += 1

print(ans)