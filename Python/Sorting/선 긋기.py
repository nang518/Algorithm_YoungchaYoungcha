n = int(input())

lines = []
for _ in range(n):
    lines.append(tuple(map(int, input().split())))

lines.sort()

start, end = lines[0][0], lines[0][1]
ans = 0

for i in range(1,n):
    if lines[i][0] <= end < lines[i][1]:
        end = lines[i][1]
    
    elif end < lines[i][0]:
        ans += end - start
        start = lines[i][0]
        end = lines[i][1]

ans += end - start

print(ans)