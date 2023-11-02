from collections import deque
import sys
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    p = input().strip()
    n = int(input())
    arr = input().strip()

    d = deque(arr[1:-1].split(','))
    
    if n == 0:
        d =  deque()    

    r_cnt = 0
    for i in range(len(p)):
        # R이 나온 경우 값만 카운팅하여 배열이 뒤집히는지 안뒤집히는지만 판별
        if p[i] == 'R':
            r_cnt += 1
        elif p[i]  ==  'D':
            if len(d) == 0:
                print("error")
                break
            else:
                # 원래 상태인 경우에는 앞에서 제거
                if r_cnt % 2 == 0: 
                    d.popleft()
                # 뒤집힌 경우에는 뒤에서 제거
                else:
                    d.pop()
                    
    else:
        if r_cnt %  2 == 1:
            d.reverse()
    
        print('[' + ','.join(d) + ']' )