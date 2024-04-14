import sys
input = sys.stdin.readline

k,l = map(int, input().split())

button = {}

for i in range(l):
    number = input().strip()
    button[number] = i

button = sorted(button.items(), key = lambda x : x[1])

for i in range(k):
    try: # 수강신청 인원이 정원보다 적을 경우가 있을 수도 있어
        print(button[i][0])
    except:
        pass

# 시간 초과
# k,l = map(int, input().split())

# button = []

# for _ in range(l):
#     number = int(input())

#     if number in button:
#         button.remove(number)
    
#     button.append(number)

# for i in range(k):
#     print(button[i])