t = int(input())
 
for _ in range(t):
    n, a, b, c = map(int, input().split())
 
    cycle = a + b + c
 
    # complete 3-day cycles
    full = n // cycle
    days = full * 3
    rem = n % cycle
 
    # if exactly completed in cycles
    if rem == 0:
        print(days)
    else:
        # check remaining days
        if rem <= a:
            print(days + 1)
        elif rem <= a + b:
            print(days + 2)
        else:
            print(days + 3)