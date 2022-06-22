s = int(input())
answer = 0
i = 1

while i * (i+1) / 2 <= s:
    answer = i
    i += 1
print(answer)