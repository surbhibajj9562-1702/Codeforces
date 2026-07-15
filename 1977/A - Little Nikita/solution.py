t = int(input())
 
for _ in range(t):
    n, m = map(int, input().split())
    
    if m <= n and (n - m) % 2 == 0:
        print("Yes")
    else:
        print("No")