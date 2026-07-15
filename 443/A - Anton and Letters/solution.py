s = input().strip()
 
letters = set()
 
for ch in s:
    if 'a' <= ch <= 'z':
        letters.add(ch)
 
print(len(letters))