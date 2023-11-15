import sys
input = sys.stdin.readline 

n,m = map(int, input().split())

pokemon = {}

for i in range(1, n+1):
    name = input().strip()

    pokemon[i] = name
    pokemon[name] = i

for _ in range(m):
    q = input().strip()

    if q.isdigit():
        print(pokemon[int(q)])
    else:
        print(pokemon[q])