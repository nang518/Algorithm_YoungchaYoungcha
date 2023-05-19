import sys
input = sys.stdin.readline

k = int(input())
n = list(map(int, input().split()))
tree = [[] for _ in range(k)]

def inorder(arr, x):
    mid = len(arr)//2
    tree[x].append(arr[mid])

    if len(arr)==1:
        return
    inorder(arr[:mid], x+1)
    inorder(arr[mid+1:], x+1)

inorder(n, 0)
for i in range(k):
    print(*tree[i])