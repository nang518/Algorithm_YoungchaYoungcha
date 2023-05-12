def solution(sizes):
    a = []
    b = []

    for s in sizes:
        a.append(max(s))
        b.append(min(s))

    
    return max(a)*max(b)