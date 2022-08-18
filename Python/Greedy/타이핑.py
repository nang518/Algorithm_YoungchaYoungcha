s = input()
caps = False
answer = len(s)

for i in range(len(s)):
    upper = s[i].isupper()
    if upper and not caps: #소문자 -> 대문자
        caps = True
        answer += 1
        if i < len(s)-1:
            if s[i+1].islower():
                caps = False
    
    elif caps and not upper: #대문자 -> 소문자
        caps = False
        answer += 1
        if i < len(s)-1:
            if s[i+1].isupper():
                caps = True
            
print(answer)