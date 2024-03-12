point = []
big = []
final = []
total = 0

for _ in range(8):
    point.append(int(input()))

sortedPoint = sorted(point, reverse = True)

for i in range(5):
    big.append(sortedPoint[i])

for i in big:
    total += i
    final.append(point.index(i) +1)

final.sort()

print(total)
print(*final, end = ' ')