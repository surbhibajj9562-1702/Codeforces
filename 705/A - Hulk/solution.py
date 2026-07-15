n = int(input())
 
result = []
for i in range(1, n + 1):
    if i % 2 == 1:
        result.append("hate")
    else:
        result.append("love")
 
print("I " + " that I ".join(result) + " it")