n = int(input())
start,end = 0,1
cnt, total = 0,1

while start<=end and end<=n:
    if total == n: 
        cnt += 1
        end += 1
        total += end
    
    elif total < n:
        end += 1
        total += end
    
    else: # 합이 n보다 큰 경우
        total -= start
        start += 1

print(cnt)