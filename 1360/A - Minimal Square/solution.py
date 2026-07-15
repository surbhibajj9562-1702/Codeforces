import sys
 
def solve():
    input = sys.stdin.read().split()
    if not input:
        return
    
    t = int(input[0])
    ptr = 1
    results = []
    
    for _ in range(t):
        a = int(input[ptr])
        b = int(input[ptr + 1])
        ptr += 2
        
        side = max(min(a, b) * 2, max(a, b))
        results.append(str(side * side))
    
    sys.stdout.write("
".join(results) + "
")
 
if __name__ == "__main__":
    solve()