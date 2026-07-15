import sys
input = sys.stdin.readline
 
t = int(input())
res = []
 
for _ in range(t):
    n, k = map(int, input().split())
    a = list(map(int, input().split()))
    
    if k == 1:
        if a == sorted(a):
            res.append("YES")
        else:
            res.append("NO")
    else:
        res.append("YES")
 
print("
".join(res))