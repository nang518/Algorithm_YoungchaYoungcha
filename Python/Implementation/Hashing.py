l = int(input())
s = input()

m = 1234567891
r = 31

result = 0

for i in range(l):
    n = ord(s[i]) - 96
    result += n * r ** i

print(result % m)