def solution(cap, n, deliveries, pickups):
    answer = 0
    
    deliveries = deliveries[::-1]
    pickups = pickups[::-1]

    complete_delivery = 0
    complete_pick = 0

    for i in range(n):
        complete_delivery += deliveries[i]
        complete_pick += pickups[i]

        while complete_delivery > 0 or complete_pick > 0:
            complete_delivery -= cap
            complete_pick -= cap

            answer += (n-i) * 2

    return answer