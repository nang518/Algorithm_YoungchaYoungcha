n = int(input())

dic = {}
for _ in range(n):
    a,b = map(int, input().split())
    dic[a] = b

r = int(input())

for _ in range(r):
    result = []
    l = list(map(int, input().split()))

    for i in range(1, l[0]+1):
        if l[i] in dic:
            result.append(dic[l[i]])
            break
        
    if result:
        print(*result)
    else:
        print("YOU DIED")