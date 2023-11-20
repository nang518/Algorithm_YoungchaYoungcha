import sys
input = sys.stdin.readline

s = input().rstrip()

stk = []
tag = False
result = ''

for i in s:
    if i == ' ':
        while stk:
            result += stk.pop()
        
        result += i
    
    elif i == '<':
        while stk:
            result += stk.pop()

        result += i
        tag = True
    
    elif i == '>':
        tag = False
        result += i

    elif tag:
        result += i
    
    else:
        stk.append(i)
    
while stk:
    result += stk.pop()

print(result)