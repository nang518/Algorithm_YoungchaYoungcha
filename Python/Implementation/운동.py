N,m,M,T,R = map(int, input().split())
heart,cnt = m, 0

if m + T > M:
    print(-1)

else:
    while N:
        if heart + T <= M:
            heart += T
            N -= 1
            cnt += 1
        
        else:
            heart -= R
            if heart < m:
                heart = m
            
            cnt += 1
    
    print(cnt)