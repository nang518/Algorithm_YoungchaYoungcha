import sys
input = sys.stdin.readline

n = int(input())
cards = list(map(int, input().split()))
m = int(input())
checks = list(map(int, input().split()))

dic = {}
for i in range(len(cards)):
    dic[cards[i]] = 0

for i in range(len(cards)):
    dic[cards[i]] += 1

for check in checks:
    if check in dic:
        print(dic[check], end = ' ')
    else:
        print(0, end = ' ')