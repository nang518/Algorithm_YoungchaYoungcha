import sys
input = sys.stdin.readline

n, game = input().split()

name = set()
for _ in range(int(n)):
    name.add(input())

if game == 'Y':
    print(len(name))

elif game == 'F':
    print(len(name)//2)

elif game == 'O':
    print(len(name)//3)