s="   pyt   hon "
print(s.replace(" ",""))
for i in range(len(s)):
    if s[i] !=" ":
        print(s[i],end='')
       
  
ch="a"
print()
print(ch.isdigit())
ch=" "
print(ch.isspace())
ch="num2"
print(ch.isidentifier())