import sys
input = sys.stdin.readline

n = int(input())

dic = {}
for _ in range(n):
    name = input()

    if name in dic:
        dic[name] += 1
    else:
        dic[name] = 1

max = 0
dic = dict(sorted(dic.items()))

for i in dic:
    if dic[i] > max:
        max = dic[i]
        result = i

print(result)