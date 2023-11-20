n,c = map(int, input().split())
message = list(map(int, input().split( )))

cnt = {}

for m in message:
    if m in cnt:
        cnt[m] += 1
    
    else:
        cnt[m] = 1

cnt = sorted(cnt.items(), key = lambda x:x[1], reverse = True)

for key,value in cnt:
    for _ in range(value):
        print(key, end = ' ')