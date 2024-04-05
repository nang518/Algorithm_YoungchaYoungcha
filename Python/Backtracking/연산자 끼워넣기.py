n = int(input())
a = list(map(int, input().split()))
add, sub, mul, div = map(int, input().split())


arr = []

def backTracking(idx, result, add, sub, mul, div):

    if idx == n:
        arr.append(result)

    if add:
        backTracking(idx + 1, result + a[idx], add-1, sub, mul, div)
    
    if sub:
        backTracking(idx + 1, result - a[idx], add, sub-1, mul, div)

    if mul:
        backTracking(idx + 1, result * a[idx], add, sub, mul-1, div)
    
    if div:
        backTracking(idx + 1, int(result / a[idx]), add, sub, mul, div-1)

backTracking(1, a[0], add, sub, mul, div)

print(max(arr))
print(min(arr))