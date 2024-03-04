n = int(input())
cards = list(map(int, input().split()))

m = int(input())
checks = list(map(int, input().split()))

dic = {}

for i in cards:
    if i not in dic:
        dic[i] = 1
    
    else:
        dic[i] += 1
    
for i in checks:
    if i in dic:
        print(dic[i], end = ' ')
    else:
        print(0, end = ' ')