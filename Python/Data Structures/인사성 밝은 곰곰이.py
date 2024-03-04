n = int(input())

cnt = 0

# 1 
# 아슬아슬 통과 (시간초과 후 정답처리)

# for _ in range(n):
#     chat = input()

#     if chat == 'ENTER':
#         dic = {}
    
#     else:
#         if chat not in dic:
#             dic[chat] = 0
#             cnt += 1

member = set()

for _ in range(n):
    chat = input()

    if chat != 'ENTER':
        if chat not in member:
            cnt += 1
            member.add(chat)
    
    else:
        member.clear()

print(cnt)