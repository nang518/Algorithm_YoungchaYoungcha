n,m = map(int,input().split())

board = []
for i in range(n):
    board.append(input())

cnt = []
for x in range(n-7):
    for y in range(m-7):
        white_idx = 0
        black_idx = 0

        for i in range(x,x+8):
            for j in range(y,y+8):
                if (i+j)%2==0: #짝수인 경우
                    if board[i][j]!='W':
                        white_idx += 1
                    else:
                        black_idx += 1
                else: #홀수인 경우
                    if board[i][j] != 'W':
                        black_idx += 1
                    else:
                        white_idx += 1
            
        cnt.append(white_idx)
        cnt.append(black_idx)

print(min(cnt))