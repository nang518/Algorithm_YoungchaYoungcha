n = int(input())
cmd = list(input())

for _ in range(n-1):
    tmp = input()
    
    for i in range(len(cmd)):
        if cmd[i] == tmp[i]:
            continue
        else:
            cmd[i] = '?'

print(*cmd, sep = "")