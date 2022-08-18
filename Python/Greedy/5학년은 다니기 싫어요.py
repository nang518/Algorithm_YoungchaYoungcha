import sys
input = sys.stdin.readline

n,a,b = map(int,input().split())

lecture = []
for _ in range(10):
    x,y = map(int,input().split())
    lecture.append([x,y])

cnt = 8-n
if a>=66 and b>=130:
    print('Nice')
else:
    for i in range(cnt):
        a += lecture[i][0] * 3
        b += lecture[i][0] * 3
        credit = 6 - lecture[i][0]
        if credit < lecture[i][1]:
            b += credit * 3
        else:
            b += lecture[i][1] * 3
        
        credit = 6

    if a>=66 and b>=130:
        print("Nice")
    else:
        print("Nae ga wae")