from itertools import permutations

def get_result(n, results):
    can = []

    for p in permutations('123456789', 3):
        strike, ball = 0,0

        for i in range(3):
            if p[i] == n[i]:
                strike += 1
            elif p[i] in n:
                ball += 1
        
        if results == (strike, ball):
            can += [p]
    
    return can

t = int(input())

result = []

for _ in range(t):
    n,s,b = map(int, input().split())
    can = get_result(str(n), (s,b))

    if result == []:
        result = can
    else:
        result = [c for c in can if c in result]

print(len(result))