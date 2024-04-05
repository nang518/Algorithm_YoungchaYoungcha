n = int(input())
a = list(map(int, input().split()))

arr = []
visited = [False] * n
answer = 0

def backTracking():
    global answer

    if len(arr) == n:
        total = 0

        for i in range(n-1):
            total += abs(arr[i] - arr[i+1])
        
        answer = max(answer, total)
        return

    for i in range(n):
        if not visited[i]:
            visited[i] = True
            arr.append(a[i])
            backTracking()
            visited[i] = False
            arr.pop()

backTracking()
print(answer)