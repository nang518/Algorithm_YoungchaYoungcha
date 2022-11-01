n = int(input())
m,k = map(int,input().split()) 
a = list(map(int,input().split()))

a.sort(reverse=True)
total = m*k
cnt=0

for i in range(0,n):
    if(total>0):
        cnt += 1
        total-=a[i]
    else:
        break

if total > 0:
    print("STRESS")
else:
    print(cnt)