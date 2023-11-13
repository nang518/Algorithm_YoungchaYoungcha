import sys
input = sys.stdin.readline

n = int(input())

card = [i for i in range(1, n+1)]
delete = []

while len(card) != 1:
    delete.append(card.pop(0))
    card.append(card.pop(0))

for i in delete:
    print(i, end = ' ')

print(card[0])