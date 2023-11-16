n,m = map(int, input().split())

save = {}

for _ in range(n):
    password = input().split()

    save[password[0]] = password[1]

for _ in range(m):
    search = input()

    print(save[search])