n = int(input())

weight = []
for _ in range(n):
    weight.append(int(input()))

weight.sort(reverse = True)

ans = []
for i in range(n):
    ans.append(weight[i] * (i+1))

print(max(ans))