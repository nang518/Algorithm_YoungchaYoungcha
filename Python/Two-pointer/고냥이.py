n = int(input())
a = input()

if len(a) == 1:
    print(1)
elif len(set(a)) <= n:
    print(len(a))
else:
    start,end = 0,0
    check = set(a[start])
    ans = 0

    while start < len(a)-1:
        if end == len(a):
            break
        
        check.add(a[end])

        # 문자 종류가 n개인 경우
        if len(check) == n:
            ans = max(ans, end-start+1)
            end += 1
        
        # 문자 종류가 n개 초과인 경우
        elif len(check) > n:
            # start와 end 포인터 값을 조정하고 check 초기화
            check.clear()
            start += 1
            end = start
            check.add(a[start])
        
        # 문자 종류가 n개 미만인 경우
        else:
            end += 1
    
    print(ans)