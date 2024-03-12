n = int(input())

name = []

for _ in range(n):
    name.append(input())

increase_name = sorted(name)
decrease_name = sorted(name, reverse = True)

if name == increase_name:
    print("INCREASING")

elif name == decrease_name:
    print("DECREASING")

else:
    print("NEITHER")