L,R = map(str,input().split())

cnt = 0

if len(L) != len(R): #자릿수 다른 경우
    print(0)
else: #자릿수 같은 경우
    if L[0] != R[0]: #첫째자리 수가 다른 경우
        print(0)
    else:
        if L[0] == '8':
            cnt += 1
        for i in range(1, len(L)):
            if L[i] != R[i]:
                break
            else:
                if L[i] == '8':
                    cnt += 1

        print(cnt)