import sys
input = sys.stdin.readlines

line = input()

arr = []
for i in line:
    for j in i.split():
        arr.append(int(j[::-1]))

arr = arr[1:]
arr.sort()

for n in arr:
    print(n)