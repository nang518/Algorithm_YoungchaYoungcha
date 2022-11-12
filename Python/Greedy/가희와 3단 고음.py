n,a,d = map(int,input().split())
octave = list(map(int,input().split()))
check = 0

for i in range(n):
    if octave[i] == a:
        check += 1
        a += d

print(check)