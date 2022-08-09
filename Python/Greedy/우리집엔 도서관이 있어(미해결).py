# N = int(input())
# book_list = []
# for i in range(N):
#     book_list.append(int(input()))

# max = book_list[0]
# cnt = 0
# for i in range(1,N):
#     if book_list[i] > max:
#         if max+1 != book_list[i]:
#             cnt += 1
#         max = book_list[i]
#     else:
#         cnt += 1
# print(cnt)

import sys

N = int(input())
book_list = []
for i in range(N):
    book_list.append(int(sys.stdin.readline()))

cnt = 0
max = book_list[0]
for i in range(1,N):
    if book_list[i] > max:
        if book_list != max + 1:
            cnt += 1
        max = book_list[i]
    else:
        cnt += 1
print(cnt)