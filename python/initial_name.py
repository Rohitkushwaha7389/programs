s="Ashish Kumar Vishwakarma"
print(s[0],end='')
for i in range(1,len(s)):
    if s[i]==" ":
        print(s[i+1],end='')



s="Ashish Kumar Vishwakarma"
for i in range (len(s)-1,0,-1):
    if s[i]==" ":
        print(s[i+1],end='')
        print(s[0],end='')