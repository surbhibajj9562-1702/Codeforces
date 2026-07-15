t = int(input())
 
for _ in range(t):
    a, b, c = map(int, input().split())
    
    if a > b:
        print("First")
    elif a < b:
        print("Second")
    else:
        print("First" if c % 2 else "Second")