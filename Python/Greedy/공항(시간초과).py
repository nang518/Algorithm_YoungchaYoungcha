import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

G = int(input()) #게이트 수
P = int(input()) #비행기 수
gate = [-1 for _ in range(G+1)]
arr = []
for _ in range(P):
    arr.append(int(input()))

answer = 0 
for i in arr:
    while i > 0:
        if gate[i] == -1:
            gate[i] = 0
            answer += 1
            break
        i -= 1
    if i == 0:
        break

print(answer)