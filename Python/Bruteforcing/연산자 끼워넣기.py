import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
add,sub,mul,div = map(int,input().split())

arr = []

def dfs(result, i, add, sub, mul, div):
    if i==n:
        arr.append(result)
    else:
        if add:
            dfs(result+a[i], i+1, add-1, sub, mul, div)
        if sub:
            dfs(result-a[i], i+1, add, sub-1, mul, div)
        if mul:
            dfs(result*a[i], i+1, add, sub, mul-1, div)
        if div:
            dfs(int(result/a[i]), i+1, add, sub, mul, div-1)

dfs(a[0], 1, add, sub, mul, div)
print(max(arr))
print(min(arr))