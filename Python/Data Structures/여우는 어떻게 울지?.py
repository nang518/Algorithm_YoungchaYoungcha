import sys
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    quiz = input().split()

    animals = []
    fox = []

    while True:
        s = input().split()

        if s[1] != 'goes':
            break
    
        animals.append(s[2])

    for i in quiz:
        if i not in animals:
            fox.append(i)
    
    print(*fox)