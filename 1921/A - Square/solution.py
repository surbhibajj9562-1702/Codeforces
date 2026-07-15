t = int(input())
 
for _ in range(t):
    x = []
    y = []
    
    for _ in range(4):
        xi, yi = map(int, input().split())
        x.append(xi)
        y.append(yi)
    
    side = max(max(x) - min(x), max(y) - min(y))
    print(side * side)