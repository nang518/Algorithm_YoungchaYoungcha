import sys
input = sys.stdin.readline

s = input()
q = int(input())

for _ in range(q):
    a,l,r = input().split()
    
    total = 0

    for i in range(int(l), int(r)+1):
        if s[i] == a:
            total += 1

    print(total)