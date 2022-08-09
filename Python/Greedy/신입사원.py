from audioop import maxpp
import sys
t = int(input())

for _ in range(t):
    people = list()

    n = int(input())
    for _ in range(n):
        first, second = map(int,sys.stdin.readline().split())
        people.append((first, second))

    people.sort()

    max = people[0][1]
    cnt = 1
    
    for i in range(n):
        if max > people[i][1]:
            max = people[i][1]
            cnt += 1
    
    print(cnt)