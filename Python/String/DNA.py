n,m = map(int, input().split())

dna = []
for _ in range(n):
    dna.append(input())

result = ''
cnt = 0

for i in range(m):
    dic = {}
    for j in range(n):
        if dna[j][i] in dic:
            dic[dna[j][i]] += 1
        else:
            dic[dna[j][i]] = 1
    
    dic = sorted(dic.items(), key = lambda x : (-x[1], x[0]))

    result += dic[0][0]
    cnt += n - dic[0][1]

print(result)
print(cnt)