import sys
input = sys.stdin.readline

while True:
    n,m = map(int, input().split())
    
    if n==0 & m==0:
        break

    n_arr, m_arr = [],[]
    for _ in range(n):
        tmp = int(input())
        n_arr.append(tmp)
    
    for _ in range(m):
        tmp = int(input())
        m_arr.append(tmp)
    
    n_pointer, m_pointer = 0,0
    cnt = 0

    while n_pointer < n and m_pointer < m:
        if n_arr[n_pointer] == m_arr[m_pointer]:
            cnt += 1
            n_pointer += 1
            m_pointer += 1
    
        elif n_arr[n_pointer] < m_arr[m_pointer]:
            n_pointer += 1
        
        else:
            m_pointer += 1
    
    print(cnt)