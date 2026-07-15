def solve():
    # Read the number of test cases
    t = int(input())
    
    for _ in range(t):
        # Read the size of the array
        n = int(input())
        
        # Read the array elements as a list of integers
        a = list(map(int, input().split()))
        
        # 1. Count the total number of 2s in the array
        total_twos = a.count(2)
        
        # 2. If the total number of 2s is odd, it's impossible to split equally
        if total_twos % 2 != 0:
            print(-1)
            continue
            
        # 3. We need exactly half of the 2s on the left side
        target = total_twos // 2
        current_twos = 0
        
        # 4. Iterate through the array to find the split point k
        for k in range(n):
            if a[k] == 2:
                current_twos += 1
            
            # As soon as the left side has exactly half the 2s, we've found our smallest k
            if current_twos == target:
                # k is 0-indexed in our loop, but the problem wants a 1-indexed answer
                print(k + 1)
                break
 
if __name__ == "__main__":
    solve()