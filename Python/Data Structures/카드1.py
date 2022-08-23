N = int(input())
card = [i for i in range(1,N+1)]
discard = []

while len(card) != 1:
    discard.append(card.pop(0)) #버리는 카드
    card.append(card.pop(0)) #옮기는 카드

for i in discard:
    print(i, end=' ')

print(card[0])