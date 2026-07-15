t = int(input())
 
required = {
    0: 3,
    1: 1,
    2: 2,
    3: 1,
    5: 1
}
 
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    
    freq = {}
    ans = 0
    
    for i in range(n):
        freq[a[i]] = freq.get(a[i], 0) + 1
        
        ok = True
        for d in required:
            if freq.get(d, 0) < required[d]:
                ok = False
                break
        
        if ok:
            ans = i + 1
            break
    
    print(ans)