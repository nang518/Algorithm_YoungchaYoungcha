rating = ['A+', 'A0', 'B+', 'B0', 'C+', 'C0', 'D+', 'D0', 'F', 'P']
grade = [4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0]

total = 0
result = 0

for _ in range(20):
    x,y,z = input().split()

    if z != 'P':
        total += float(y)
        result += float(y) * grade[rating.index(z)]

print('%.6f' %(result/total))