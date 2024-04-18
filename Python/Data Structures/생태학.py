import sys
input = sys.stdin.readline

dic = {}
total = 0

while True:
    s = input().strip()

    if s == '':
        break

    if s in dic:
        dic[s] += 1
    else:
        dic[s] = 1
    
    total += 1

dicList = list(dic.keys())
dicList.sort()

for i in dicList:
    per = dic[i] / total * 100

    print("%s %.4f" %(i, per))