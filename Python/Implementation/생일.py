n = int(input())

student = []

for _ in range(n):
    n,d,m,y = input().split()
    d,m,y = map(int, (d,m,y))

    student.append((y,m,d,n))

student.sort()

print(student[-1][3])
print(student[0][3])