N,M = map(int,input().split())
J = int(input())

sum = 0
left = 1
right = M

for i in range(J):
    apple = int(input())

    if left <= apple and apple <= right:
        continue
    if left > apple:
        sum += abs(left - apple)
        right = apple + (M-1)
        left = apple
    elif right < apple:
        sum += abs(right - apple)
        left = apple - (M-1)
        right = apple
print(sum)