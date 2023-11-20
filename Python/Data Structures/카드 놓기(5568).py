from itertools import permutations

n = int(input())
k = int(input())

num = []
for _ in range(n):
    num.append(input())

result = set()

for i in permutations(num, k):
    result.add(''.join(i))

print(len(result))