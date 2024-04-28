# 머리 위치
def head(arr):
    for i in range(n):
        for j in range(n):
            if arr[i][j] == '*':
                return i,j

# 왼쪽 팔 길이
def leftArm(x,y):
    cnt = 0

    for i in range(y-1, -1, -1):
        cnt += 1

        if arr[x][i] == '_':
            return cnt - 1
    
    return cnt

# 오른쪽 팔 길이
def rightArm(x,y):
    cnt = 0

    for i in range(y+1, n):
        cnt += 1

        if arr[x][i] == '_':
            return cnt - 1
    
    return cnt

# 허리 길이
def waist(x,y):
    cnt = 0

    for i in range(x+1, n):
        cnt += 1

        if arr[i][y] == '_':
            break
    
    return cnt-1

# 다리 길이
def leg(x,y):
    cnt = 1

    for i in range(x+1, n):
        cnt += 1

        if arr[i][y] == '_':
            return cnt - 2
    
    return cnt - 1

n = int(input())

arr = []

for _ in range(n):
    arr.append(input())

# 출력
x,y = head(arr)
print(x+2,y+1) # 심장 위치
print(leftArm(x+1,y), end = ' ') # 왼쪽 팔 길이
print(rightArm(x+1,y), end = ' ') # 오른쪽 팔 길이

waistCnt = waist(x+1, y)
print(waistCnt, end = ' ') # 허리 길이
print(leg(x + waistCnt + 1, y-1), end = ' ') # 왼쪽 다리 길이
print(leg(x + waistCnt + 1, y+1)) # 오른쪽 다리 길이