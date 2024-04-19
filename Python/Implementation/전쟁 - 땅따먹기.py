import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
    t = list(map(int, input().split()))
    dic = {}
    maxKey, maxValue = 0,0

    for i in range(1, t[0]+1):
        if t[i] in dic:
            dic[t[i]] += 1
        else:
            dic[t[i]] = 1
    
        if dic[t[i]] > maxValue:
            maxValue = dic[t[i]]
            maxKey = t[i]
    
    if maxValue > t[0] // 2:
        print(maxKey)
    else:
        print("SYJKGW")