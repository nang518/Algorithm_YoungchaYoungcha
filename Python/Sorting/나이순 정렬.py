n = int(input())

member = []
for _ in range(n):
    age, name = map(str, input().split())

    age = int(age)
    member.append((age,name))

member.sort(key = lambda x : x[0])

for age,name in member:
    print(age, name)