t = int(input())

for _ in range(t):
    n = int(input())

    wear = {}
    cnt = 1

    for _ in range(n):
        item = list(input().split())

        if item[1] in wear:
            wear[item[1]] += 1
        else:
            wear[item[1]] = 1

    for i in wear:
        cnt *= (wear[i]+1) # +1 : 안입는 경우

    print(cnt-1) # -1 : 전부 안입는 경우