from itertools import permutations
n = int(input())
a = list(map(int, input().split()))
ans = 0

p = permutations(a)
for i in p:
    tmp = 0
    for j in range(len(i)-1):
        tmp += abs(i[j]-i[j+1])
    
    if tmp > ans:
        ans = tmp

print(ans)