n,k = map(int, input().split())

points = []

for _ in range(n):
    points.append(float(input()))

points.sort()

# 절사평균
total = 0
cnt = 0

for i in range(k, n-k):
    total += points[i]
    cnt += 1

print("{:.2f}".format(total/cnt+0.00000001))

# 보정평균
total += (points[k] * k) + (points[n-k-1] * k)
cnt += k * 2

print("{:.2f}".format(total/cnt+0.00000001))