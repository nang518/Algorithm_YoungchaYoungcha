def check(i,j,check):
    if check == '<':
        return i < j

    else:
        return i > j

def backTracking(d,s):
    global minAns, maxAns

    if d == k+1:
        if len(minAns) == 0:
            minAns = s
        else:
            maxAns = s
    
        return

    for i in range(10):
        if not visited[i]:
            if d == 0 or check(s[-1], str(i), sign[d-1]):
                visited[i] = True
                backTracking(d+1, s+str(i))
                visited[i] = False

k = int(input())
sign = list(input().split())

minAns = ''
maxAns = ''
visited = [False] * 10

backTracking(0, '')
print(maxAns)
print(minAns)