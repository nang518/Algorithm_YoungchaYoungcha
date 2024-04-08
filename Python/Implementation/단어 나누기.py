s = list(input().strip())

arr = []

for i in range(1, len(s)-1):
    for j in range(i+1, len(s)):
        first = s[:i]
        second = s[i:j]
        third = s[j:]

        first.reverse()
        second.reverse()
        third.reverse()

        result = ''.join(first + second + third)
        arr.append(result)

print(min(arr))