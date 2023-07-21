'''x=[2,9,6,3,7,5]
a=[9,6,1,5]
b=[1,4,10,9]
if len(a) == len(b):
    for i in range(len(a)):
        
     if a[i] in x:
        ind=x.index(a[i])
     x[ind]=b[i]
x.sort()
print(x)'''
x=[2,6,9,11,7,5]
flag =1
for num in x:
    if num < 1 or num >10:
        flag =0
        break
if flag==1:
    print("all number are with in range")
else:
    print("invalid number")
        

