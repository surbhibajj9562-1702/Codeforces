s = input().strip()
i = 0
result = ""
 
while i < len(s):
    if s[i] == '.':
        result += '0'
        i += 1
    else:
        if s[i+1] == '.':
            result += '1'
        else:
            result += '2'
        i += 2
 
print(result)