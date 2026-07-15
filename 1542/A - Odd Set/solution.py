t_str = input()
if t_str:
    t = int(t_str)
    for i in range(t):
    
        n = int(input())
        nums = list(map(int, input().split()))
        odd_count = 0
        for x in nums:
            if x % 2 != 0:
                odd_count += 1
        if odd_count == n:
            print("Yes")
        else:
            print("No")