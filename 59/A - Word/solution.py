s = input().strip()
 
ucount = 0
lcount = 0
 
for ch in s:
    if ch.isupper():
        ucount += 1
    else:
        lcount += 1
 
if ucount > lcount:
    print(s.upper())
else:
    print(s.lower())