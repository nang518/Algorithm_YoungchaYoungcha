n,m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a_pointer, b_pointer = 0,0
result = []

while a_pointer != len(a) or b_pointer != len(b):
    if a_pointer == len(a):
        result.append(b[b_pointer])
        b_pointer += 1
    
    elif b_pointer == len(b):
        result.append(a[a_pointer])
        a_pointer += 1
    
    else:
        if a[a_pointer] < b[b_pointer]:
            result.append(a[a_pointer])
            a_pointer += 1
        else:
            result.append(b[b_pointer])
            b_pointer += 1


print(*result)