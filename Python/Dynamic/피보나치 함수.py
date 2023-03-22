import sys
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    n = int(input())
    zero, one = 1,0

    for i in range(n):
        zero, one = one, zero+one #나눠서 계산하면 갱신된 zero의 값이 더해지기 때문에 한 줄로 작성
        
    print(zero, one)
