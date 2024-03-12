n = int(input())
s = list(map(int, input().split()))

s.sort()

total = []

for i in range(n):
    tmp = s[i] + s.pop()
    total.append(tmp)
    
print(min(total))