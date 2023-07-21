l1=[3,4,5,5,6,5]
l2=[]
for i in range(0,len(l1)):
            current_element=l1[i]
            if current_element not in l2:
                l2.append(current_element)
print(l2)
l2.sort()

print(l2)