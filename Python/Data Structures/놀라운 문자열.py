while True:
    s = input()

    if s == '*':
        break
 

    cnt = 0
    
    for idx in range(1, len(s)-1):
        dic = {}

        for i in range(len(s) - idx):
            x = s[i] + s[i+idx]

            if x not in dic:
                dic[x] = 1
            else:
                cnt += 1
                break

    if cnt == 0:
        print(s + " is surprising.")
    
    else:
        print(s + " is NOT surprising.")