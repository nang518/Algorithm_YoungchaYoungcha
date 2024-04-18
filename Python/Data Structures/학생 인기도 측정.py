n = int(input())
a = input().split()

favorite = {}

for i in range(n):
    favorite[a[i]] = 0

for i in range(n):
    x = input().split()

    for j in range(len(x)):
        favorite[x[j]] += 1

favorite = sorted(favorite.items(), key = lambda x : (-x[1], x[0]))


for key,value in favorite:
    print(key, value)