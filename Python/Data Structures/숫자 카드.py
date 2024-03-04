n = int(input())
cards = list(map(int, input().split()))

m = int(input())
checks = list(map(int, input().split()))

dic = {}
for i in range(n):
    dic[cards[i]] = 0

for i in range(m):
    if checks[i] not in dic:
        print(0, end = ' ')
    
    else:
        print(1, end = ' ')