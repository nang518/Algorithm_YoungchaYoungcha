n = int(input())

arr = []
for _ in range(n):
    x,y = map(int, input().split())

    arr.append((x,y))

# y좌표가 같으면 x좌표 증가 순으로 정렬
arr.sort(key = lambda x : (x[1],x[0]))

for x,y in arr:
    print(x,y)