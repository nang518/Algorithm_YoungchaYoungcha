import sys
input = sys.stdin.readline

n = int(input())
parent = [i for i in range(n+1)]

def find(parent,x):
    if parent[x] != x:
        parent[x] = find(parent,parent[x])
    return parent[x]

def union(parent,a,b):
    a = find(parent,a)
    b = find(parent,b)

    if a<b:
        parent[b] = a
    else:
        parent[a] = b

for _ in range(n-2):
    a,b = map(int,input().split())
    union(parent,a,b)

answer = []
for i in range(1,n+1):
    if i == parent[i]:
        answer.append(i)
print(*answer)