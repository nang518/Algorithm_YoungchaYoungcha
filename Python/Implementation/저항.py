def count(n):
    if n == 'black':
        return '0'

    elif n == 'brown':
        return '1'

    elif n == 'red':
        return '2'
    
    elif n == 'orange':
        return '3'

    elif n == 'yellow':
        return '4'
    
    elif n == 'green':
        return '5'
    
    elif n == 'blue':
        return '6'
    
    elif n == 'violet':
        return '7'
    
    elif n == 'grey':
        return '8'
    
    elif n == 'white':
        return '9'

color = []

for _ in range(3):
    color.append(input())

ans = int(count(color[0]) + count(color[1])) * (10 ** int(count(color[2])))

print(ans)