n = int(input())

word = []

for _ in range(n):
    s = list(input())

    s.sort()
    s = ''.join(s)

    if s not in word:
        word.append(s)
    
print(len(word))