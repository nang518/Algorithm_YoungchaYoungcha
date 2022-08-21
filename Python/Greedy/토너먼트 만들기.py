n = int(input())
rank = list(map(int,input().split()))

result = 0
for _ in range(len(rank)-1):
    target = max(rank) #제일 랭킹이 낮은 선수
    index = rank.index(target)

    if index == 0: #타겟이 맨 왼쪽에 있는 경우
        result += rank[index] - rank[index+1]
    elif index == len(rank)-1: #타겟이 맨 오른쪽에 있는 경우
        result += rank[index] - rank[index-1]
    else: 
        result += min(rank[index]-rank[index+1], rank[index]-rank[index-1])
    
    del rank[index]

print(result)