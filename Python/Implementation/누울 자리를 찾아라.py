n = int(input())

arr = []
r_cnt, c_cnt = 0, 0

for i in range(n):
    arr.append(input())

for i in range(n):
    x,y = 0,0

    for j in range(n):
        if arr[i][j] == '.':
            x += 1
        else:
            x = 0
        
        if x == 2:
            r_cnt += 1
        

        if arr[j][i] == '.':
            y += 1
        else:
            y = 0

        if y == 2:
            c_cnt += 1

print(r_cnt, c_cnt)