n = input()

ans = 0

for i in range(1, len(n)):
    ans += 9 * 10 ** (i-1) * i

ans += (int(n) - 10 ** (len(n)-1) + 1) * len(n)

print(ans)