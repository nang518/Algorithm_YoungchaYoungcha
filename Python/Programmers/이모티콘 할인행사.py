import itertools

def solution(users, emoticons):
    
    answer = [0, 0]
    data = [10, 20, 30, 40]
    discount = []
    
    # 이모티콘 할인율 가능한 모든 조합
    def dfs(tmp, d):
        if d == len(tmp):
            discount.append(tmp[:])
            return
        
        else:
            for i in data:
                tmp[d] += i
                dfs(tmp, d+1)
                tmp[d] -= i
    
    dfs([0] * len(emoticons), 0)

    # 완전탐색
    for dis in range(len(discount)):
        member, price = 0, [0] * len(users)
        for e in range(len(emoticons)):
            for u in range(len(users)):
                # 할인율 만족하면 구매
                if users[u][0] <= discount[dis][e]:
                    price[u] += emoticons[e] * (100 - discount[dis][e]) / 100

        # 플러스 가입자 갱신
        for u in range(len(users)):
            if price[u] >= users[u][1]:
                member += 1
                price[u] = 0
            
        if member >= answer[0]:
            if member == answer[0]:
                answer[1] = max(answer[1], sum(price))
            
            else:
                answer[1] = sum(price)
            
            answer[0] = member

    return answer