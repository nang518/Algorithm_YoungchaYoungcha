n = int(input())
a = list(map(int, input().split()))

sortedA = sorted(a)

result = []

for i in a:
    result.append(sortedA.index(i))
    sortedA[sortedA.index(i)] = - 1

print(*result, end = ' ')