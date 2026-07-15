import sys
input = sys.stdin.readline
 
t = int(input())
 
for _ in range(t):
    n = int(input())
    a = [0] * n
    b = [0] * n
 
    for i in range(n):
        a[i], b[i] = map(int, input().split())
 
    total = 0
    min_extra = float('inf')
 
    for i in range(n):
        prev = (i - 1 + n) % n
 
        damage_needed = max(0, a[i] - b[prev])
        total += damage_needed
 
        min_extra = min(min_extra, a[i] - damage_needed)
 
    print(total + min_extra)