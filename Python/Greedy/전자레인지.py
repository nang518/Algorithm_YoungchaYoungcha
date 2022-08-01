T = int(input())

A=0
B=0
if(T%10!=0):
    print(-1)
else:
    if(T>=300):
        A+=T//300
        T-=A*300
    if(T>=60):
        B+=T//60
        T-=B*60
    print(A, B, T//10)