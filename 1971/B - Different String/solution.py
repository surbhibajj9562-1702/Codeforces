t = int(input())
 
for i in range(t):
    s = input().strip()
    
    if len(set(s)) == 1:
        print("NO")
    else:
        print("YES")
        print(s[1:] + s[0])