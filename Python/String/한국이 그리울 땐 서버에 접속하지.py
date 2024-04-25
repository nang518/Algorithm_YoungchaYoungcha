n = int(input())
pattern = input().split('*')

for _ in range(n):
    s = input()
    start = ''
    end = ''

    if len(pattern[0]) < len(s):
        for i in range(len(pattern[0])):
            start += s[i]
    
    if len(pattern[1]) <= len(s) - len(start):
        for i in range(len(pattern[1])):
            end += s[len(s)-(i+1)]
    
    end = list(end)
    end.reverse()
    end = ''.join(end)
    
    if pattern[0] == start and pattern[1] == end:
        print("DA")
    else:
        print("NE")