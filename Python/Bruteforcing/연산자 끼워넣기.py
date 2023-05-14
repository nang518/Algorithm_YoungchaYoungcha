import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int,input().split()))
plus, minus, mul, div = map(int,input().split())
arr = []

def dfs(result, i, plus, minus, mul, div):
    if i == n:
        arr.append(result)
    else:
        if plus:
            dfs(result+a[i], i+1, plus-1, minus, mul, div)
        if minus:
            dfs(result-a[i], i+1, plus, minus-1, mul, div)
        if mul:
            dfs(result*a[i], i+1, plus, minus, mul-1, div)
        if div:
            dfs(int(result/a[i]),i+1, plus, minus, mul, div-1)

dfs(a[0], 1, plus, minus, mul, div)
print(max(arr))
print(min(arr))