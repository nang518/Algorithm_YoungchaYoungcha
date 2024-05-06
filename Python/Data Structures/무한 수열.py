from collections import defaultdict
import sys
input = sys.stdin.readline

def dfs(n):
    if dic[n] != 0:
        return dic[n]
    
    dic[n] = dfs(n//p) + dfs(n//q)
    return dic[n]

n,p,q = map(int, input().split())
dic = defaultdict(int)
dic[0] = 1

print(dfs(n))