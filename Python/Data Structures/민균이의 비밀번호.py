n = int(input())

file = []

for _ in range(n):
    s = input()
    file.append(s)

    reversed_s = s[::-1]
    
    if reversed_s in file:
        length = len(s)
        password = s[length // 2]

print(length, password)