n,w,l = map(int, input().split())
a = list(map(int, input().split()))

cnt = 0
bridge = [0] * w

while bridge:
    cnt += 1
    bridge.pop(0)

    if a:
        if sum(bridge) + a[0] <= l:
            bridge.append(a.pop(0))
        else:
            bridge.append(0)

print(cnt)