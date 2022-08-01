S = int(input())

ans = 0
i=1
while i*(i+1) /2 <= S:
    ans = i
    i += 1
print(ans)