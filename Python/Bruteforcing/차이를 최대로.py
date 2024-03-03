from itertools import permutations

n = int(input())
a = list(map(int, input().split()))

p = permutations(a)

result = 0

for i in p:
    ans = 0

    for j in range(len(i)-1):
        ans += abs(i[j] - i[j+1])

    if ans > result:
        result = ans

print(result)