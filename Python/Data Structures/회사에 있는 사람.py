n = int(input())

dic = {}

for _ in range(n):
    log = input().split()

    if log[1] == 'enter':
        dic[log[0]] = 0

    else:
        del dic[log[0]]

dic = sorted(dic.keys(), reverse = True)

for i in dic:
    print(i)