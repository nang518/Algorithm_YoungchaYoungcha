n = int(input())
postfix = input()
num_arr = [0] * n

for i in range(n):
    num_arr[i] = int(input())

stk = []

for i in postfix:
    if 'A' <= i <= 'Z':
        stk.append(num_arr[ord(i) - ord('A')])
    
    else:
        num2 = stk.pop()
        num1 = stk.pop()

        if i == '+':
            stk.append(num1 + num2)
        
        elif i == '-':
            stk.append(num1 - num2)
        
        elif i == '*':
            stk.append(num1 * num2)
        
        elif i == '/':
            stk.append(num1 / num2)

print('%.2f' %stk[0])