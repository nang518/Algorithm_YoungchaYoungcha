N = int(input())
arr = []
for _ in range(N):
    arr.append(int(input()))

arr.sort(reverse=True)

answer = []
for i in range(N):
    answer.append(arr[i] * (i+1))

print(max(answer))