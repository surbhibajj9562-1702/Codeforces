n = int(input())
levels = set(range(1, n + 1))
 
x = set(map(int, input().split()[1:]))
y = set(map(int, input().split()[1:]))
 
if levels <= (x | y):
    print("I become the guy.")
else:
    print("Oh, my keyboard!")