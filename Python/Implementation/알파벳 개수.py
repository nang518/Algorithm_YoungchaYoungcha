s = input()

alpha = [0] * 26

for i in s:
    x = ord(i) - 97
    alpha[x] += 1

print(*alpha)