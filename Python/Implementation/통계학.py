import sys
input = sys.stdin.readline

n = int(input())

num = []
cnt = {}
sum = 0

for i in range(n):
    tmp = int(input())

    num.append(tmp)
    sum += tmp

    if tmp not in cnt:
        cnt[tmp] = 1
    
    else:
        cnt[tmp] += 1

num.sort()

print(round(sum/n)) # 평균
print(num[n//2]) # 중앙값

# 최빈값
f = max(cnt.values())
frequency = []

for key,value in cnt.items():
    if value == f:
        frequency.append(key)

frequency.sort()

if len(frequency) == 1:
    print(frequency[0])

else:
    print(frequency[1])

# 범위
print(num[-1] - num[0])