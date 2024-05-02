n,m,b = map(int, input().split())

dic = {}

for _ in range(n):
    x = list(map(int, input().split()))

    for i in x:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1

high = max(dic.keys())
low = min(dic.keys())

shortTime = int(1e9)
ground = 0

for i in range(low, high+1):
    boxPlus,boxMinus = 0,0
    
    for k,v in dic.items():
        if k > i:
            boxMinus += (k-i) * v
        else:
            boxPlus += (i-k) * v

    if boxMinus + b < boxPlus:
        continue

    else:
        time = boxMinus * 2 + boxPlus
        
        if shortTime >= time:
            shortTime = time
            ground = i

print(shortTime, ground)