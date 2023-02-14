import sys
input = sys.stdin.readline

n,m = map(int,input().split())
board = []
for i in range(n):
    board.append(input())

cnt = []
for i in range(n-7):
    for j in range(m-7):
        w_idx, b_idx = 0,0 #w_idx: w로 시작할 때 바뀐 경우, b_idx: b로 시작할 때 바뀐 경우

        #현재 행,열의 번호 합이 짝수이면 시작점의 색깔과 같아야 하고, 홀수이면 달라야 함
        for a in range(i,i+8):
            for b in range(j, j+8):
                if (a+b) % 2 == 0:
                    if board[a][b] != 'W':
                        w_idx += 1
                    else:
                        b_idx += 1
                else:
                    if board[a][b] != 'W':
                        b_idx += 1
                    else:
                        w_idx += 1

        cnt.append(w_idx)
        cnt.append(b_idx)

print(cnt)

