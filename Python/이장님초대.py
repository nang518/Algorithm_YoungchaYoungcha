n = int(input())
t = list(map(int, input().split()))
t.sort(reverse = True)

days = t[0]
if n == 1:
    print(n+2)
else:
    for i in range(1,n):
        if days < (i+t[i]):
            days = i + t[i]
    result = days + 2
    print(result)