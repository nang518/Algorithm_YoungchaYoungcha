import sys
input = sys.stdin.readline

n,m,k = map(int, input().split())

dic = {}
total = 0

for _ in range(n):
    s,p = input().split()

    dic[s] = int(p)

for _ in range(k):
    t = input().strip()

    total += dic[t]
    del dic[t]

minValue, maxValue = 0,0
dic = sorted(dic.items(), key = lambda x : x[1])

for i in range(m-k):
    minValue += dic[i][1]
    maxValue += dic[-i-1][1]
    
print(minValue + total, maxValue + total)