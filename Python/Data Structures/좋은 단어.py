n = int(input())

cnt = 0

for _ in range(n):
    word = input().rstrip()

    stk = []

    for i in range(len(word)):
        if stk and word[i] == stk[-1]:
            stk.pop()
        else:
            stk.append(word[i])

    if not stk:
        cnt += 1

print(cnt)