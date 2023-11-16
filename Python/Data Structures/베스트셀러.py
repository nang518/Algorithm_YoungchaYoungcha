n = int(input())

book = {}

for _ in range(n):
    title = input()

    if title in book:
        book[title] += 1
    else:
        book[title] = 1

max = 0

for best in sorted(book):
    if book[best] > max:
        max = book[best]
        result = best

print(result)