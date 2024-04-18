from collections import deque

n = int(input())
word = []

for _ in range(n):
    word.append(input().strip())

for i in range(n):
    dq = deque(word[i])

    while True:
        dq.rotate(1)

        x = ''.join(dq)
        
        if x == word[i]:
            break
    
        if x in word:
            idx = word.index(x)

            word.pop(idx)
            word.insert(idx, word[i])

word = set(word)
print(len(word))