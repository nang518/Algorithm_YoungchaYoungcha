import sys
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    n,m = map(int, input().split())
    p = list(map(int, input().split()))

    cnt = 0
    index = [i for i in range(n)]

    while True:
        # 현재 문서가 중요도가 제일 높은 경우
        if p[0] == max(p): 
            cnt += 1

            # 궁금한 문서인지 확인
            if index[0] == m:
                print(cnt)
                break
            else:
                del p[0]
                del index[0]
        
        # 현재 문서보다 중요도가 높은 문서가 있는 경우
        else:
            p.append(p[0])
            del p[0]
            index.append(index[0])
            del index[0]