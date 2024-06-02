def change(n):
    if switch[n] == 0:
        switch[n] = 1
    else:
        switch[n] = 0
    
    return

n = int(input())
switch = [0] + list(map(int, input().split()))
student = int(input())
for _ in range(student):
    s, num = map(int, input().split())

    if s == 1:
        for i in range(num, n+1, num):
            change(i)
    
    else:
        change(num)

        for i in range(1, n//2):
            if num + i > n or num - i < 1:
                break

            if switch[num + i] == switch[num - i]:
                change(num + i)
                change(num - i)

            else:
                break         

for i in range(1, n+1):
    print(switch[i], end = ' ')

    if i % 20 == 0:
        print()