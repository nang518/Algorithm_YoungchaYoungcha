t = int(input())

for _ in range(t):
    a = list(map(int, input().split()))

    cnt = 0

    for i in range(1, len(a)-1):
        for j in range(i+1, len(a)):
            if a[i] > a[j]:
                tmp = a[i]
                a[i] = a[j]
                a[j] = tmp
                cnt += 1
    
    print(a[0], cnt)