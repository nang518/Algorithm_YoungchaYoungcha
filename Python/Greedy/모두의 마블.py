n = int(input())
l = list(map(int,input().split()))
l.sort(reverse=True)

coin = 0
for i in l[1:]:
    coin += l[0] + i

print(coin)