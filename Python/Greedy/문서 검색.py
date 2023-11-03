import sys
input = sys.stdin.readline 

text = input().strip()
word = input().strip()

idx, cnt = 0,0

while idx < len(text):
    if text[idx : idx+len(word)] == word:
        idx += len(word)
        cnt += 1
    else:
        idx += 1

print(cnt)