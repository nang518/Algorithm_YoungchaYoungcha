import sys
input = sys.stdin.readline

N = int(input())
max_weight = list(map(int,input().split()))

M = int(input())
box_weight = list(map(int,input().split()))

if max(max_weight) < max(box_weight):
    print(-1)
else:
    max_weight.sort()
    box_weight.sort(reverse=True)
    time = 0

    while box_weight:
        for i in range(0, len(max_weight)):
            for j in range(0, len(box_weight)):
                if max_weight[i] >= box_weight[j]:
                    del box_weight[j]
                    break
        time += 1
    
    print(time)