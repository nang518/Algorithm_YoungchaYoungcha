text = input().strip()
word = input().strip()

cnt, idx = 0,0

while idx < len(text):
    if text[idx : idx + len(word)] == word:
        cnt += 1
        idx += len(word)

    else:
        idx += 1

print(cnt)