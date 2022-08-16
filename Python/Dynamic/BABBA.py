import sys
input = sys.stdin.readline

K = int(input())
fibonacci = [0] * (K+1)
fibonacci[1] = 1

for i in range(2,K+1):
    fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]

print(fibonacci[K-1], fibonacci[K])