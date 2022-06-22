n,m = map(int,input().split())
j = int(input())

sum = 0
left = 1
right = m

for i in range(j):
    apple = int(input())

    if left <= apple and apple <= right: #바구니 안에 떨어지는 경우
        continue
    if left > apple: #바구니 왼쪽과 가까이 떨어지는 경우
        sum += abs(left - apple)
        right = apple + (m-1)
        left = apple
    elif right < apple: #바구니 오른쪽과 가까이 떨어지는 경우
        sum += abs(right - apple)
        left = apple - (m-1)
        right = apple
print(sum)