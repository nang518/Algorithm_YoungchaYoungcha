n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

answer = 0

for _ in range(n):
    answer += min(a) * max(b)
    a.remove(min(a))
    b.remove(max(b))

print(answer)