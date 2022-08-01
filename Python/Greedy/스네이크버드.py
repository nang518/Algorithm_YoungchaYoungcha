N,L = map(int,input().split())
H = list(map(int,input().split()))
H.sort()

for i in range(len(H)):
    if L >= H[i]:
        L += 1
print(L)