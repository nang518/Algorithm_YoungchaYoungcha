n = int(input())
arr = list(map(int, input().split()))

if n == 1:
    print('A')

elif n == 2:
    if arr[0] == arr[1]:
        print(arr[0])
    
    else:
        print('A')

else:
    if arr[0] == arr[1]:
        a = 0
    
    else:
        a = (arr[2] - arr[1]) // (arr[1] - arr[0])

    b = arr[1] - arr[0] * a

    for i in range(n-1):
        expect = arr[i] * a + b

        if arr[i+1] != expect:
            print('B')
            exit()
    
    print(arr[-1] * a + b)