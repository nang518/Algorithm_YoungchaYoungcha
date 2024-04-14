import sys
input = sys.stdin.readline

n = int(input())

nameList = {}

for _ in range(n):
    name = input().strip()

    if name not in nameList:
        nameList[name] = 1
    
    else:
        nameList[name] += 1

for _ in range(n-1):
    name = input().strip()

    if name in nameList:
        nameList[name] -= 1
    
for k,v in nameList.items():
    if v != 0:
        print(k)