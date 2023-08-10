import sys
input = sys.stdin.readline

n = int(input())

userId = []
answer = []
success = []
correct = 0
for _ in range(n):
    x, id, result, a,b,c,d = list(input().split())
    
    userId.append(id)
    answer.append(result)

    if id != 'megalusion':
        if result == '4':
            if id not in success:
                correct += 1
                success.append(id)
        
            else:
                userId.remove(id)
        else:
            if id in success:
                userId.remove(id)

tmp = 0
for i in range(len(success)):
    tmp += userId.count(success[i])-1
    
try: # 분모가 0일 경우 예외처리
    ans = (correct / (correct + tmp)) * 100
    print(ans)
except:
    print(0)