N = int(input())
A = list(map(int,input().split()))
B = list(map(int,input().split()))

answer = 0

for i in range(N):
    answer += min(A) * max(B)
    A.remove(min(A))
    B.remove(max(B))

print(answer)