t = int(input())
 
for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    
    zero_count = arr.count(0)
    negative_count = arr.count(-1)
    
    operations = zero_count
 
    if negative_count % 2 != 0:
        operations += 2
    
    print(operations)