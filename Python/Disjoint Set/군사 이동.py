import sys
input = sys.stdin.readline
import heapq

def find(a):
    if parent[a] != a:
        parent[a] = find(parent[a])
    return parent[a]

def union(a,b):
    a = find(a)
    b = find(b)

    if a<b:
        parent[b] = a
    else:
        parent[a] = b

p, w = map(int, input().split())
c, v = map(int, input().split())

parent = [i for i in range(p+1)]
pq = []

for i in range(w):
    s,e,width = map(int,input().split())
    heapq.heappush(pq, (-width,s,e))

while pq:
    cost,start,end = heapq.heappop(pq)
    cost = -cost
    union(start,end)

    if find(c) == find(v):
        result = cost
        break

print(result)