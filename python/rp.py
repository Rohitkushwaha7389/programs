l1=[3,4,5,5,6,5]
l2=[]
for i in range(0,len(l1)):
            current_element=l1[i]
            if current_element not in l2:
                l2.append(current_element)

for i in range(len(l2)):
    a=l1.count(l2[i])
    print(l2[i],"-",a)


