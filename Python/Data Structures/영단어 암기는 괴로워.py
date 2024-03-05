import sys
input = sys.stdin.readline

n,m = map(int, input().split())

words = {}

for _ in range(n):
    word = input().rstrip()

    if len(word) < m:
        continue
    
    else:
        if word in words:
            words[word] += 1
        
        else:
            words[word] = 1

words = sorted(words.items(), key = lambda x : (-x[1], -len(x[0]), x[0]))

for i in words:
    print(i[0])