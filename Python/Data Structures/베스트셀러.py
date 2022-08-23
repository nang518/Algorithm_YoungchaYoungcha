N = int(input())
dic = {}

for _ in range(N):
    name = input()
    if name in dic:
        dic[name] += 1
    else:
        dic[name] = 1

book = dict(sorted(dic.items()))
max = 0

for i in book:
    if book[i] > max:
        max = book[i]
        max_key = i

print(max_key)