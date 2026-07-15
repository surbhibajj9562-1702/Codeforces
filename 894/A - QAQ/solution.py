s = input().strip()
 
n = len(s)
prefix_q = [0] * n
suffix_q = [0] * n
 
# Count Qs from left
count = 0
for i in range(n):
    if s[i] == 'Q':
        count += 1
    prefix_q[i] = count
 
# Count Qs from right
count = 0
for i in range(n - 1, -1, -1):
    if s[i] == 'Q':
        count += 1
    suffix_q[i] = count
 
# Count QAQ
ans = 0
for i in range(n):
    if s[i] == 'A':
        left_q = prefix_q[i]
        right_q = suffix_q[i]
        ans += left_q * right_q
 
print(ans)