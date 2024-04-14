import sys
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    n = int(input())

    key1 = input().split()
    key2 = input().split()
    secret = input().split()

    indexList = []
    for i in key1:
        indexList.append(key2.index(i))

    result = []
    for i in indexList:
        result.append(secret[i])

    print(*result)