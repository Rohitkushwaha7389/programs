a=[45,5,6,6,3,2]
b=[1,2,3]
c=list()
for i in range(0,len(a)):
    if i not in b:
        c.append(i)
c.sort()
print(c)       
