import sys
input = sys.stdin.readline

m = int(input())

dic = {}

for _ in range(m):
    request = input().split()

    if request[0] == '1':
        dic[request[2]] = request[1]
    
    else:
        print(dic[request[1]])