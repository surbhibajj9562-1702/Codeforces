import sys
 
def solve():
    # Read n and m
    input_data = sys.stdin.read().split()
    if not input_data:
        return
    
    # We don't actually need n and m for the logic, 
    # we just need to check all remaining characters.
    pixels = input_data[2:]
    
    # Check if any pixel is Cyan, Magenta, or Yellow
    for char in pixels:
        if char in ('C', 'M', 'Y'):
            print("#Color")
            return
            
    print("#Black&White")
 
if __name__ == "__main__":
    solve()