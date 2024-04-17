s = input()

dic = {}
p,k,t,h = 13,13,13,13

for i in range(0, len(s), 3):
    x = s[i] + s[i+1] + s[i+2]
    if x not in dic:
        dic[x] = 1

        if s[i] == 'P':
            p -= 1
        elif s[i] == 'K':
            k -= 1
        elif s[i] == 'T':
            t -= 1
        else:
            h -= 1
    
    else:
        print("GRESKA")
        quit()

print(p,k,h,t)