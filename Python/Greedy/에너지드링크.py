N = float(input())
X = list(map(int,input().split()))

X.sort(reverse=True)

result = 0
count = 1

for i in X:
    if count == 1:
        count += 1
        result += i
        continue
    else:
        result += (i/2)

print(result)