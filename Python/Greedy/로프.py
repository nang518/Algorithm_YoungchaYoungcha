n = int(input())

arr = []
for _ in range(n):
    arr.append(int(input()))

arr.sort(reverse = True)

answer = []
for i in range(n):
    answer.append(arr[i] * (i+1))

print(max(answer))
print(answer)