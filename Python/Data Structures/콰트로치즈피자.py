n = int(input())

topping = list(input().split())

dic = {}

for i in topping:
    if "Cheese" == i[-6:]:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1
    
if len(dic) >= 4:
    print("yummy")
else:
    print("sad")