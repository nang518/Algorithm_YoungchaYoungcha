import sys
input = sys.stdin.readline

list = []
for _ in range(9):
    list.append(int(input()))
list.sort()
sum = sum(list)

one, two = 0,0
for i in range(8):
    for j in range(i+1,9):
        if sum - (list[i]+list[j]) == 100:
            one = list[i]
            two = list[j]

list.remove(one)
list.remove(two)
list.sort()

for i in list:
    print(i)