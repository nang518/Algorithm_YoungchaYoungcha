import sys
input = sys.stdin.readline

n = int(input())

arr = []
stk = []
cnt = 0

for _ in range(n):
    arr.append(int(input()))

for i in range(n):
    # stk에 빌딩 높이 정보가 존재하는 경우
    while stk:
        # 현재 빌딩의 높이가 top보다 크거나 같은 경우
        if stk[-1] <= arr[i]:
            # 현재 빌딩의 높이가 top보다 
            stk.pop()
        else:
            break
        
    stk.append(arr[i])
    cnt += len(stk) -1

print(cnt)