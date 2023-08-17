t = int(input())
for _ in range(t):
    n,m = map(int,input().split())
    a = list(map(int,input().split()))
    b = list(map(int,input().split()))
    a.sort()
    b.sort()

# 시간초과
#     a_start, b_start = 0,0
#     cnt = 0
#     while a_start<n and b_start<m:
#         if a[a_start] > b[b_start]:
#             cnt += 1
#             b_start += 1
#             if b_start == m:
#                 a_start += 1
#                 b_start = 0
        
#         else:
#             a_start += 1
#             b_start = 0
    
#     print(cnt)

    pair,cnt = 0,0
    for i in range(n):
        while True:
            if cnt == m or a[i] <= b[cnt]:
                pair += cnt
                break
            else:
                cnt += 1

    print(pair)