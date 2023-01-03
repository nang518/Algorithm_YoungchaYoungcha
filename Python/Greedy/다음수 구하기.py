t = int(input())
for _ in range(t):
    num = list(map(int,input()))  
    index = 0

    # 입력받은 숫자 역순으로 탐색
    # 왼쪽 값이 오른쪽 값보다 작아지는 i를 index 값으로 저장
    for i in range(len(num)-1, 0, -1):
        if num[i] > num[i-1]:
            if i == len(num) - 1:
                index = len(num) - 2
            else:
                index = i - 1
            break
    
    a = num[:index]
    b = num[index:]
    
    if not a or not b:
        print("BIGGEST")
    else:
        b.sort()
        for i in range(len(b)):
            #num의 index 값보다 b의 i값이 크다면, a에 i 값 append 나머지 b를 뒤에 extend
            if b[i] > num[index]:
                a.append(b.pop(i))
                a.extend(b)
                break

        print(''.join(map(str,a)))