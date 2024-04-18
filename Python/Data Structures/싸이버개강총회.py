import sys
input = sys.stdin.readline

s,e,q = input().split()
s = int(s[:2] + s[3:])
e = int(e[:2] + e[3:])
q = int(q[:2] + q[3:])

set = set()
cnt = 0

while True:
    try:
        time, name = input().split()
        time = int(time[:2] + time[3:])

        if time <= s:
            set.add(name)
        
        elif name in set and e <= time <= q:
            set.remove(name)
            cnt += 1

    except:
        break

print(cnt)