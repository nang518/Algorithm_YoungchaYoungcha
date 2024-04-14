n = int(input())

books = {}

for i in range(n):
    book = input()  

    if book not in books:
        books[book] = 1
    
    else:
        books[book] += 1

max = 0

for best in sorted(books):
    if books[best] > max:
        max = books[best]
        result = best

print(result)