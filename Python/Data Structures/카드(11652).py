n = int(input())

number = {}

for _ in range(n):
    x = int(input())

    if x in number:
        number[x] += 1
    else:
        number[x] = 1

max = 0

for i in sorted(number):
    if number[i] > max:
        max = number[i]
        result = i

print(result)