t = int(input())
for _ in range(t):
    grid = [input().strip() for _ in range(10)]
    
    ans = 0
    for i in range(10):
        for j in range(10):
            if grid[i][j] == 'X':
                ans += min(i, j, 9-i, 9-j) + 1
    
    print(ans)