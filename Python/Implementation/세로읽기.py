word = []
length = []

for _ in range(5):
    w = input()

    word.append(w)
    length.append(len(w))

result = ''

for i in range(max(length)):
    for j in range(5):
        if i < length[j]:
            result += word[j][i]

print(result)