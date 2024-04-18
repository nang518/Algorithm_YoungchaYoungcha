from collections import defaultdict
import sys
input = sys.stdin.readline

n,m = map(int, input().split())

dic = defaultdict(list)

for _ in range(n):
    team = input().strip()
    member = int(input())

    for _ in range(member):
        name = input().strip()
        
        dic[team].append(name)
        
dic = dict(dic)

for _ in range(m):
    quiz = input().strip()
    quiz_type = int(input())

    if quiz_type == 0:
        for key, value in dic.items():
            if quiz in key:
                value.sort()

                for j in value:
                    print(j)
                break

    elif quiz_type == 1:
        for key, value in dic.items():
            if quiz in value:
                print(key)
                break