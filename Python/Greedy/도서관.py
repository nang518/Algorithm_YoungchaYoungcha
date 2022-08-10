N,M = map(int,input().split())
place = list(map(int,input().split()))

left = []
right = []
distance = []

for i in place:
    if i>0:
        right.append(i)
    else:
        left.append(i)

max = 0
for i in place:
    if abs(i) > abs(max):
        max = i

left.sort()
for i in range(0, len(left), M):
    if left[i] != max:
        distance.append(left[i])

right.sort(reverse=True)
for i in range(0, len(right), M):
    if right[i] != max:
        distance.append(right[i])

answer = abs(max)
for i in distance:
    answer += abs(i*2)

print(answer)