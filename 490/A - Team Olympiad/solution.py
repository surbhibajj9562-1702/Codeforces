n = int(input())
t = list(map(int, input().split()))
 
p = []  # programming
m = []  # maths
pe = [] # PE
 
for i in range(n):
    if t[i] == 1:
        p.append(i + 1)
    elif t[i] == 2:
        m.append(i + 1)
    else:
        pe.append(i + 1)
 
w = min(len(p), len(m), len(pe))
print(w)
 
for i in range(w):
    print(p[i], m[i], pe[i])