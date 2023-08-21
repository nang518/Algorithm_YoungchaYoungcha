import sys
from collections import defaultdict
input = sys.stdin.readline

#n: 접시 수, d: 초밥 가짓수, k: 연속해서 먹는 접시 수, c: 쿠폰 번호
n,d,k,c = map(int,input().split())
sushi = []
for _ in range(n):
    sushi.append(int(input()))

start,end = 0, k-1
dict = defaultdict(int) # 구간 내 접시 종류별 개수 카운팅
dict[c] += 1 # 구간 내에는 항상 쿠폰 번호가 포함되어 있다고 가정

for i in range(end+1):
    dict[sushi[i]] += 1

result = -int(1e9)
while start < n: 
    # 현재 구간 내의 접시 종류 개수와 최대 접시 종류 개수 비교
    result = max(result, len(dict)) 

    # 오른쪽으로 한 칸씩 이동
    # 현재 구간의 가장 왼쪽 접시 제거
    dict[sushi[start]] -= 1
    if dict[sushi[start]] == 0: # 해당 접시가 남아있지 않은 경우 딕셔너리에서 제거
        del dict[sushi[start]]
    start += 1
    end += 1
    
    # 원형이기 때문에 오른쪽 인덱스는 (오른쪽 인덱스를 접시의 수로 나눈 나머지로 사용)
    dict[sushi[end%n]] += 1

print(result)