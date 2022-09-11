import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n = int(input())
arr = list(map(int,input().split()))
s = int(input())

def dfs(x):
    global cnt
    visited[x] = True

    left = x - arr[x]
    right = x + arr[x]

    if (0<=left) and not visited[left]:
        cnt += 1
        dfs(left)
    if (right<n) and not visited[right]:
        cnt += 1
        dfs(right)

visited = [False for _ in range(n)]
cnt = 1

dfs(s-1)
print(cnt)