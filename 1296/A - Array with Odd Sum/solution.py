t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    
    odd = sum(1 for x in arr if x % 2 == 1)
    even = n - odd
    
    if odd > 0 and even > 0:
        print("YES")
    elif odd == n:
        if n % 2 == 1:
            print("YES")
        else:
            print("NO")
    else:
        print("NO")