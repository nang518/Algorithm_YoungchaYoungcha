n = int(input())

student = []

for _ in range(n):
    student.append(input())

for i in range(1, len(student[0]) + 1):
    c = set()

    for s in student:
        c.add(s[-i:])
    
    if len(c) == n:
        answer = i
        break

print(answer)