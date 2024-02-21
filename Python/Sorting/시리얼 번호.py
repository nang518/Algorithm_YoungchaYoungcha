n = int(input())

def sum_num(s):
    ans = 0

    for x in s:
        if x.isdigit():
            ans += int(x)

    return ans

arr = []
for _ in range(n):
    arr.append(input())

arr.sort()
arr.sort(key = lambda x : (len(x), sum_num(x), x))

for i in arr:
    print(i)